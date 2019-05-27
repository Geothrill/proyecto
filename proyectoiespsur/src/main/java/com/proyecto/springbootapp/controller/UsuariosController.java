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

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody Iterable<UsuariosEntity> getAllUsers() {

        return usuariosRepository.findAll();
    }
    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.POST)
    @ResponseBody
    public  UsuariosEntity getUsuarioByIdUsuario(@PathVariable("idUsuario") int idUsuario) {
        return usuariosRepository.findByIdUsuario(idUsuario);
    }
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public void createUsuario(@RequestParam String nombre, @RequestParam String apellidos,@RequestParam String email,@RequestParam String password){
        usuariosRepository.createUsuario(nombre, apellidos, email, password);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void deleteUsuario(@RequestParam int idUsuario){
        usuariosRepository.deleteUsuario(idUsuario);

    }

    @RequestMapping(value ="/login", method = RequestMethod.POST)
    public UsuariosEntity login(@RequestParam String email,@RequestParam String password){
        return usuariosRepository.findByEmailAndPassword(email, password);
    }

}
