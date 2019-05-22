package com.proyecto.springbootapp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reservas")
@Table(name = "reservas")
public class ReservasEntity  {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int id_reserva;
    @DateTimeFormat
    public Date fechaReserva;
    @DateTimeFormat
    public Date fechaEntrada;
    @DateTimeFormat
    public Date fechaSalida;
    public double precio;

    @ManyToOne(targetEntity = UsuariosEntity.class)
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    public UsuariosEntity usuario;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private ValoracionesEntity idValoraciones;
    @ManyToOne(targetEntity = HabitacionesEntity.class)
    @JoinColumn(name = "id_habitaciones")
    public HabitacionesEntity habitaciones;
    @ManyToOne(targetEntity = PensionesEntity.class)
    @JoinColumn(name = "id_pensiones", insertable = false, updatable = false)
    public PensionesEntity pensiones;

    public ReservasEntity() {
    }

    public ReservasEntity(int id_reserva, Date fechaReserva, Date fechaEntrada, Date fechaSalida, double precio,
                          UsuariosEntity usuario, ValoracionesEntity idValoraciones, HabitacionesEntity habitaciones, PensionesEntity pensiones) {
        this.id_reserva = id_reserva;
        this.fechaReserva = fechaReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
        this.usuario = usuario;
        this.idValoraciones = idValoraciones;
        this.habitaciones = habitaciones;
        this.pensiones = pensiones;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public UsuariosEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosEntity usuario) {
        this.usuario = usuario;
    }

    public ValoracionesEntity getIdValoraciones() {
        return idValoraciones;
    }

    public void setIdValoraciones(ValoracionesEntity idValoraciones) {
        this.idValoraciones = idValoraciones;
    }

    public HabitacionesEntity getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(HabitacionesEntity habitaciones) {
        this.habitaciones = habitaciones;
    }

    public PensionesEntity getPensiones() {
        return pensiones;
    }

    public void setPensiones(PensionesEntity pensiones) {
        this.pensiones = pensiones;
    }
}

