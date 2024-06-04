package com.agudelo.reservacion.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Reservacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Long viajeId;
    private String fechaReservacion;
    private String estado;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getViajeId() {
        return viajeId;
    }

    public void setViajeId(Long viajeId) {
        this.viajeId = viajeId;
    }

    public String getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
