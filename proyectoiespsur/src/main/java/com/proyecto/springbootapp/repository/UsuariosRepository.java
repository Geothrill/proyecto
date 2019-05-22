package com.proyecto.springbootapp.repository;

import com.proyecto.springbootapp.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Integer> {

    List<UsuariosEntity> findAll();

    UsuariosEntity findByIdUsuario(int idUsuario);

}
