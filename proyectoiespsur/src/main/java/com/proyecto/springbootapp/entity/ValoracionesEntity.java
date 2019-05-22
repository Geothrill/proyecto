package com.proyecto.springbootapp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "valoraciones")
@Table(name = "valoraciones")
public class ValoracionesEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idValoraciones;
    @DateTimeFormat
    public Date fecha;
    @ManyToOne(targetEntity = UsuariosEntity.class)
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    public UsuariosEntity idUsuario;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    public ReservasEntity idReserva;
    public String comentarios;
    public int valor;

    public ValoracionesEntity() {
    }

    public ValoracionesEntity(int idValoraciones, Date fecha, UsuariosEntity idUsuario, ReservasEntity idReserva, String comentarios, int valor) {
        this.idValoraciones = idValoraciones;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idReserva = idReserva;
        this.comentarios = comentarios;
        this.valor = valor;
    }

    public int getIdValoraciones() {
        return idValoraciones;
    }

    public void setIdValoraciones(int idValoraciones) {
        this.idValoraciones = idValoraciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public UsuariosEntity getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuariosEntity idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ReservasEntity getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(ReservasEntity idReserva) {
        this.idReserva = idReserva;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ValoracionesRepository{" +
                "idValoraciones=" + idValoraciones +
                ", fecha=" + fecha +
                ", idUsuario=" + idUsuario +
                ", idReserva=" + idReserva +
                ", comentarios='" + comentarios + '\'' +
                ", valor=" + valor +
                '}';
    }
}
