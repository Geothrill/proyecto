package com.proyecto.springbootapp.controller;

import com.proyecto.springbootapp.entity.ReservasEntity;
import com.proyecto.springbootapp.repository.ReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ReservasController {

    @Autowired
    ReservasRepository reservasRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ReservasEntity> getAllReservas() {

        return reservasRepository.findAll();
    }
}
