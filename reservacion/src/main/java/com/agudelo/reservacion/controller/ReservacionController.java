package com.agudelo.reservacion.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agudelo.reservacion.entity.Reservacion;
import com.agudelo.reservacion.services.ReservacionService;

@RestController
@RequestMapping("/api/reservacion")
public class ReservacionController {
	private final ReservacionService reservacionService;

    @Autowired
    public ReservacionController(ReservacionService reservacionService) {
        this.reservacionService = reservacionService;
    }

    @GetMapping
    public ResponseEntity<List<Reservacion>> getAllReservaciones() {
        List<Reservacion> reservaciones = (List<Reservacion>) reservacionService.getAllReservaciones();
        return ResponseEntity.ok(reservaciones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservacion> getReservacionById(@PathVariable Long id) {
        Reservacion reservacion = reservacionService.obtenerReservacion(id);
        if (reservacion != null) {
            return ResponseEntity.ok(reservacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Reservacion> createReservacion(@RequestBody Reservacion reservacion) {
        Reservacion nuevaReservacion = reservacionService.crearReservacion(reservacion);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaReservacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservacion> updateReservacion(@PathVariable Long id, @RequestBody Reservacion reservacionDetails) {
        Reservacion reservacionActualizada = reservacionService.actualizarReservacion(id, reservacionDetails);
        if (reservacionActualizada != null) {
            return ResponseEntity.ok(reservacionActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservacion(@PathVariable Long id) {
        reservacionService.eliminarReservacion(id);
        return ResponseEntity.noContent().build();
    }

}
