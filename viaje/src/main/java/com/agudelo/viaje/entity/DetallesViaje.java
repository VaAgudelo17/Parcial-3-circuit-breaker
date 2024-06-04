package com.agudelo.viaje.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class DetallesViaje {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String nombreDestino;
	 private LocalDateTime fechaSalida;
	 private LocalDateTime fechaLlegada;
	    
	 public DetallesViaje() {
	      
	 }

	 public DetallesViaje(Long id, String nombreDestino, LocalDateTime fechaSalida, LocalDateTime fechaLlegada) {
		 
	      this.id = id;
	      this.nombreDestino = nombreDestino;
	      this.fechaSalida = fechaSalida;
	      this.fechaLlegada = fechaLlegada;
	    }

	 
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombreDestino() {
	        return nombreDestino;
	    }

	    public void setNombreDestino(String nombreDestino) {
	        this.nombreDestino = nombreDestino;
	    }

	    public LocalDateTime getFechaSalida() {
	        return fechaSalida;
	    }

	    public void setFechaSalida(LocalDateTime fechaSalida) {
	        this.fechaSalida = fechaSalida;
	    }

	    public LocalDateTime getFechaLlegada() {
	        return fechaLlegada;
	    }

	    public void setFechaLlegada(LocalDateTime fechaLlegada) {
	        this.fechaLlegada = fechaLlegada;
	    }

	    
	    

}
