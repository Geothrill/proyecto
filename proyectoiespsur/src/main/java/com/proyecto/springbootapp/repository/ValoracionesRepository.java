package com.proyecto.springbootapp.repository;

import com.proyecto.springbootapp.entity.ValoracionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValoracionesRepository extends JpaRepository<ValoracionesEntity, Integer> {
    List<ValoracionesEntity> findAll();
}
