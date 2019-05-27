package com.proyecto.springbootapp.repository;

import com.proyecto.springbootapp.entity.HabitacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface HabitacionesRepository extends JpaRepository<HabitacionesEntity, Integer> {

    List<HabitacionesEntity> findAll();

    HabitacionesEntity findByIdHabitaciones(int idHabitaciones);

    List<HabitacionesEntity> findByPrecioBetween(Double precio1, Double precio2);

    List<HabitacionesEntity> findByPrecioBetweenOrderByPrecioAsc(Double precio1, Double precio2);

    List<HabitacionesEntity> findByPrecioBetweenOrderByPrecioDesc(Double precio1, Double precio2);

    List<HabitacionesEntity> findByOcupantes (int ocupantes);

    List<HabitacionesEntity> findByOcupantesAndPrecioBetween(int ocupantes, Double precio1, Double precio2);

    @Query(value = "SELECT distinct habitaciones.*  FROM habitaciones INNER JOIN reservas  ON  reservas.idHabitaciones in" +
            "            (select idHabitaciones from reservas where fechaEntrada and fechaSalida not between ?1 and ?2)" +
            "    and  habitaciones.precio between ?3 and ?4", nativeQuery = true)
    Iterable<HabitacionesEntity> findHabitacionesLibresPrecioBetween(Date fechaEntrada, Date fechaSalida, Double precio1, Double precio2);

    @Query(value = "select distinct habitaciones.* from habitaciones inner join reservas on reservas.idHabitaciones in " +
            "(select idHabitaciones from reservas where fechaEntrada and fechaSalida not between ?1 and ?2 )" +
            "and habitaciones.precio BETWEEN ?3 AND ?4 and habitaciones.ocupantes = ?5", nativeQuery = true)
    Iterable<HabitacionesEntity> findHabitacionesLibresPrecioBetweenOcupantes (Date fechaEntrada, Date fechaSalida, Double precio1, Double precio2, int ocupantes);

    @Transactional
    @Modifying
    @Query(value = "Insert into habitaciones (descripcion, numHabitacion, pathImg, tipo, precio, ocupantes) values(?1,?2,?3,?4,?5,?6)", nativeQuery = true)
    HabitacionesEntity newHabitacion(String descripcion,int numHabitacion,String pathImg,String tipo, Double precio, int ocupantes);

    @Transactional
    @Modifying
    @Query(value = "Delete from habitaciones where idHabitaciones = ?1", nativeQuery = true)
    HabitacionesEntity deleteHabitacion(int idHabitaciones);



}
