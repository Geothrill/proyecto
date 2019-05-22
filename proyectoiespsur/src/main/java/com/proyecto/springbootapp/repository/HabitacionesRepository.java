package com.proyecto.springbootapp.repository;

import com.proyecto.springbootapp.entity.HabitacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitacionesRepository extends JpaRepository<HabitacionesEntity, Integer> {

    List<HabitacionesEntity> findAll();
}
