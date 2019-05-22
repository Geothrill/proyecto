package com.proyecto.springbootapp.entity;

import javax.persistence.*;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "habitaciones")
@Table(name = "habitaciones")
public class HabitacionesEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idHabitaciones;
    public String descripcion;
    public int num_habitacion;
    public String pathImg;
    public String tipo;
    public double precio;
    public int ocupantes;

    @OneToMany(mappedBy = "habitaciones")
    private List<ReservasEntity> reservas;

    public HabitacionesEntity() {
    }

    public HabitacionesEntity(int idHabitaciones, String descripcion, int num_habitacion, String pathImg, String tipo, double precio, int ocupantes, List<ReservasEntity> reservas) {
        this.idHabitaciones = idHabitaciones;
        this.descripcion = descripcion;
        this.num_habitacion = num_habitacion;
        this.pathImg = pathImg;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupantes = ocupantes;
        this.reservas = reservas;
    }

    public int getIdHabitaciones() {
        return idHabitaciones;
    }

    public void setIdHabitaciones(int idHabitaciones) {
        this.idHabitaciones = idHabitaciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(int num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    public List<ReservasEntity> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservasEntity> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "HabitacionesRepository{" +
                "idHabitaciones=" + idHabitaciones +
                ", descripcion='" + descripcion + '\'' +
                ", num_habitacion=" + num_habitacion +
                ", pathImg='" + pathImg + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", ocupantes=" + ocupantes +
                '}';
    }
}