package com.proyecto.springbootapp.entity;

import javax.persistence.*;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "pensiones")
@Table(name = "pensiones")
public class PensionesEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idPension;
    public String descripcion;
    public String tipo;
    public double precio;

    @OneToMany(mappedBy = "pensiones")
    private List<ReservasEntity> reservas;

    public PensionesEntity() {
    }

    public PensionesEntity(int idPension, String descripcion, String tipo, double precio, List<ReservasEntity> reservas) {
        this.idPension = idPension;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.reservas = reservas;
    }

    public int getIdPension() {
        return idPension;
    }

    public void setIdPension(int idPension) {
        this.idPension = idPension;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public List<ReservasEntity> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservasEntity> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "PensionesRepository{" +
                "idPension=" + idPension +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
