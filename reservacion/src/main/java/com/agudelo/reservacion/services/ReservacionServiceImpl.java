package com.agudelo.reservacion.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.agudelo.reservacion.entity.Reservacion;
import com.agudelo.reservacion.repository.ReservacionRepository;


@Service
public class ReservacionServiceImpl implements ReservacionService {
    private final ReservacionRepository reservacionRepository;


    public ReservacionServiceImpl(ReservacionRepository reservacionRepository) {
        this.reservacionRepository = reservacionRepository;
    }

    @Override
    public Reservacion obtenerReservacion(Long id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Error al obtener reservación", e);
        }
        
        Optional<Reservacion> optionalReservacion = reservacionRepository.findById(id);
        return optionalReservacion.orElse(null);
    }

    @Override
    public Reservacion crearReservacion(Reservacion reservacion) {
        return reservacionRepository.save(reservacion);
    }

    @Override
    public Reservacion actualizarReservacion(Long id, Reservacion reservacionDetails) {
        Optional<Reservacion> optionalReservacion = reservacionRepository.findById(id);
        if (optionalReservacion.isPresent()) {
            Reservacion reservacionExistente = optionalReservacion.get();
            reservacionExistente.setUsuarioId(reservacionDetails.getUsuarioId());
            reservacionExistente.setViajeId(reservacionDetails.getViajeId());
            reservacionExistente.setFechaReservacion(reservacionDetails.getFechaReservacion());
            reservacionExistente.setEstado(reservacionDetails.getEstado());
            return reservacionRepository.save(reservacionExistente);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarReservacion(Long id) {
        reservacionRepository.deleteById(id);
    }

    @Override
    public List<Reservacion> getAllReservaciones() {
    	Iterable<Reservacion> reservacionesIterable = reservacionRepository.findAll();
        List<Reservacion> reservacionesList = new ArrayList<>();
        reservacionesIterable.forEach(reservacionesList::add);
        return reservacionesList;
    }

	
}
