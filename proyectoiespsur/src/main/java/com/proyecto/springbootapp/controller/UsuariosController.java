package com.proyecto.springbootapp.controller;

import com.proyecto.springbootapp.entity.UsuariosEntity;
import com.proyecto.springbootapp.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuariosRepository usuariosRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody Iterable<UsuariosEntity> getAllUsers() {

        return usuariosRepository.findAll();
    }
    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    public @ResponseBody UsuariosEntity getUsuarioByIdUsuario(@RequestParam(name = "idUsuario") int idUsuario) {

        return usuariosRepository.findByIdUsuario(idUsuario);
    }

}
