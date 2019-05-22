package com.proyecto.springbootapp.controller;

import com.proyecto.springbootapp.entity.ValoracionesEntity;
import com.proyecto.springbootapp.repository.ValoracionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valoraciones")
public class ValoracionesController {

    @Autowired
    ValoracionesRepository valoracionesRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ValoracionesEntity> getAllValoraciones() {

        return valoracionesRepository.findAll();
    }
}
