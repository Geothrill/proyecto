package com.proyecto.springbootapp.controller;

import com.proyecto.springbootapp.entity.ValoracionesEntity;
import com.proyecto.springbootapp.repository.ValoracionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @RequestMapping(value = "/{idValoraciones}", method = RequestMethod.GET)
    public @ResponseBody
    ValoracionesEntity getValoracionesById(@PathVariable int idValoraciones) {
        return valoracionesRepository.findByIdValoraciones(idValoraciones);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public @ResponseBody ValoracionesEntity createValoracion
            (@RequestParam Date fecha,@RequestParam int idUsuario,@RequestParam int idReserva,@RequestParam String comentarios, @RequestParam int valor){
        return valoracionesRepository.createValoracion(fecha, idUsuario, idReserva, comentarios, valor);
    }

    @RequestMapping(value ="/usuario/{idUsuario}", method = RequestMethod.GET)
    public @ResponseBody Iterable<ValoracionesEntity> findValoracionByIdUsuario( @PathVariable int idUsuario){
        return valoracionesRepository.findByIdUsuario( idUsuario);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody ValoracionesEntity deleteValoracion(int idValoraciones){
        return valoracionesRepository.deleteValoracion(idValoraciones);
    }


}
