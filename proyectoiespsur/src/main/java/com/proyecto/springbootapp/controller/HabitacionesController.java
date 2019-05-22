package com.proyecto.springbootapp.controller;

import com.proyecto.springbootapp.entity.HabitacionesEntity;
import com.proyecto.springbootapp.repository.HabitacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionesController {

    private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Autowired
    HabitacionesRepository habitacionesRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<HabitacionesEntity> getAllHabitaciones() {

        return habitacionesRepository.findAll();
    }
}
