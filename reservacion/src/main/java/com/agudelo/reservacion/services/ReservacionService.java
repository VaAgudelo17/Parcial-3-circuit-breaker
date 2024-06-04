package com.agudelo.reservacion.services;

import java.util.List;

import com.agudelo.reservacion.entity.Reservacion;


public interface ReservacionService {
	Reservacion obtenerReservacion(Long id);
    Reservacion crearReservacion(Reservacion reservacion);
    Reservacion actualizarReservacion(Long id, Reservacion reservacion);
    void eliminarReservacion(Long id);
    List<Reservacion> getAllReservaciones();
  
}
