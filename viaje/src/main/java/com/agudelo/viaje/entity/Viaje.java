package com.agudelo.viaje.entity;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Viaje {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id_viaje;
    
    private String mensaje;
    
    @OneToOne(cascade = CascadeType.ALL)
    private DetallesViaje detallesViaje;
    
    private String nombre;

    public Viaje() {
       
    }

    public Viaje(Long id_viaje, String mensaje, DetallesViaje detallesViaje, String nombre) {
        this.id_viaje = id_viaje;
        this.mensaje = mensaje;
        this.detallesViaje = detallesViaje;
        this.nombre = nombre;
    }

    public Long getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(Long id_viaje) {
        this.id_viaje = id_viaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public DetallesViaje getDetallesViaje() {
        return detallesViaje;
    }

    public void setDetallesViaje(DetallesViaje detallesViaje) {
        this.detallesViaje = detallesViaje;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
