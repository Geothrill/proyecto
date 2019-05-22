package com.proyecto.springbootapp.repository;

import com.proyecto.springbootapp.entity.PensionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PensionesRepository extends JpaRepository<PensionesEntity, Integer> {
    List<PensionesEntity> findAll();
}
