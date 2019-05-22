package com.proyecto.springbootapp.controller;


import com.proyecto.springbootapp.entity.PensionesEntity;
import com.proyecto.springbootapp.repository.PensionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pensiones")
public class PensionesController {

    @Autowired
    PensionesRepository pensionesRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<PensionesEntity> getAllPensiones() {

        return pensionesRepository.findAll();
    }
}
