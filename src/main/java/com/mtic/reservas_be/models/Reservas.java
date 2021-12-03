package com.mtic.reservas_be.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Reservas {
    @Id
    private Integer idReserva;
    private Integer nombrecuentaUsuario;
    private Date fechaReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer personas;
    private Integer idHotel;
    private String habitacion;
    private String estado;
    private String medioPago;

    public Reservas(Integer idReserva, Integer nombrecuentaUsuario, Date fechaReserva, Date fechaInicio, Date fechaFin, Integer personas, Integer idHotel, String habitacion, String estado, String medioPago) {
        this.idReserva = idReserva;
        this.nombrecuentaUsuario = nombrecuentaUsuario;
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.personas = personas;
        this.idHotel = idHotel;
        this.habitacion = habitacion;
        this.estado = estado;
        this.medioPago = medioPago;
        System.out.println("****************************************************************************");
    }

    public Integer getIdReserva() {
        return this.idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Integer getNombrecuentaUsuario() {
        return this.nombrecuentaUsuario;
    }

    public void setNombrecuentaUsuario(Integer nombrecuentaUsuario) {
        this.nombrecuentaUsuario = nombrecuentaUsuario;
    }

    public Date getFechaReserva() {
        return this.fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getIdHotel() {
        return this.idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public String getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMedioPago() {
        return this.medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
}
