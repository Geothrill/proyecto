package com.proyecto.springbootapp.repository;

import com.proyecto.springbootapp.entity.ReservasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservasRepository extends JpaRepository<ReservasEntity, Integer> {
    List<ReservasEntity> findAll();
}
