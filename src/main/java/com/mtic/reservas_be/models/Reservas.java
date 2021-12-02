package com.mtic.reservas_be.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Reservas {
    @Id
    private Integer IdReserva;
    private Integer IdnombrecuentaUsuario;
    private Date FechaReserva;
    private Date FechaInicio;
    private Date FechaFin;
    private Integer Personas;
    private Integer idHotel;
    private String Habitacion;
    private String Estado;
    private Integer medioPago;

    public Reservas(Integer idReserva, Integer idnombrecuentaUsuario, Date fechaReserva, Date fechaInicio, Date fechaFin, Integer Personas, Integer idHotel, String habitacion, String estado, Integer medioPago) {
        IdReserva = idReserva;
        IdnombrecuentaUsuario = idnombrecuentaUsuario;
        FechaReserva = fechaReserva;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        this.Personas = Personas;
        this.idHotel = idHotel;
        Habitacion = habitacion;
        Estado = estado;
        this.medioPago = medioPago;
    }

    public Integer getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(Integer idReserva) {
        IdReserva = idReserva;
    }

    public Integer getIdnombrecuentaUsuario() {
        return IdnombrecuentaUsuario;
    }

    public void setIdnombrecuentaUsuario(Integer idnombrecuentaUsuario) {
        IdnombrecuentaUsuario = idnombrecuentaUsuario;
    }

    public Date getFechaReserva() {
        return FechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        FechaReserva = fechaReserva;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }

    public Integer getPersonas() {
        return Personas;
    }

    public void setPersonas(Integer personas) {
        Personas = personas;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String habitacion) {
        Habitacion = habitacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Integer getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Integer medioPago) {
        this.medioPago = medioPago;
    }
}
