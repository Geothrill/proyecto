package com.proyecto.springbootapp.repository;

import com.proyecto.springbootapp.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Integer> {

    List<UsuariosEntity> findAll();

    UsuariosEntity findByIdUsuario(int idUsuario);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO usuarios ( nombre, apellidos, email, password) values (?1,?2,?3,?4)", nativeQuery = true)
    void createUsuario(String nombre, String apellidos, String email, String password);

    @Transactional
    @Modifying
    @Query(value =" delete from usuarios where idUsuario = ?1", nativeQuery = true)
    void deleteUsuario(int idUsuario);

    UsuariosEntity findByEmailAndPassword(String email, String password);
}
