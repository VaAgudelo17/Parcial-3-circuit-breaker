package com.agudelo.viaje.controller;


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
import com.agudelo.usuario.entity.Usuario;
import com.agudelo.usuario.services.UsuarioService;
import com.agudelo.viaje.entity.Viaje;
import com.agudelo.viaje.service.ViajeService;


@RestController
@RequestMapping("/api/viajes")
public class ViajeController {

    private final ViajeService viajeService;


    private final ReservacionService reservacionService;


    private final UsuarioService usuarioService;

   
    public ViajeController(ViajeService viajeService, ReservacionService reservacionService, UsuarioService usuarioService) {
        this.viajeService = viajeService;
        this.reservacionService = reservacionService;
        this.usuarioService = usuarioService;
    }

  
    @GetMapping
    public List<Viaje> getAllViajes() {
        return viajeService.getAllViajes();
    }


    @GetMapping("/{id}")
    public Viaje getViajeById(@PathVariable Long id) {
        return viajeService.getViajeById(id);
    }

    @PostMapping
    public Viaje createViaje(@RequestBody Viaje viaje) {
        return viajeService.createViaje(viaje);
    }

    @PutMapping("/{id}")
    public Viaje updateViaje(@PathVariable Long id, @RequestBody Viaje viajeDetails) {
        return viajeService.updateViaje(id, viajeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteViaje(@PathVariable Long id) {
        viajeService.deleteViaje(id);
    }


    @GetMapping("/viaje")
    public ResponseEntity<String> iniciarViaje() {
        try {
            Long viajeId = 1L;
            Reservacion reservacionResponse = reservacionService.obtenerReservacion(viajeId);
            Usuario usuarioResponse = usuarioService.obtenerUsuario(viajeId);
            String response = "Viaje iniciado con éxito. Reservación: " + reservacionResponse + ", Usuario: " + usuarioResponse;
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al iniciar el viaje: " + e.getMessage());
        }
    }

}