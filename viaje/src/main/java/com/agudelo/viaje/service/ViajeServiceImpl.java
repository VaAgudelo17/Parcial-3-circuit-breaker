package com.agudelo.viaje.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.agudelo.viaje.entity.Viaje;
import com.agudelo.viaje.repository.ViajeRepository;
import java.util.List;
import java.util.Optional; 

@Service
public class ViajeServiceImpl implements ViajeService {

    private final ViajeRepository viajeRepository;

    @Autowired
    public ViajeServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public List<Viaje> getAllViajes() {
        return (List<Viaje>) viajeRepository.findAll();
    }

    @Override
    public Viaje getViajeById(Long id) {
        return viajeRepository.findById(id).orElse(null);
    }

    @Override
    public Viaje createViaje(Viaje viaje) {
        return viajeRepository.save(viaje);
    }

    @Override
    public Viaje updateViaje(Long id, Viaje viajeDetails) {
        Optional<Viaje> viajeOptional = viajeRepository.findById(id);
        if (viajeOptional.isPresent()) {
            Viaje existingViaje = viajeOptional.get();
            existingViaje.setMensaje(viajeDetails.getMensaje());
            existingViaje.setDetallesViaje(viajeDetails.getDetallesViaje());
            existingViaje.setNombre(viajeDetails.getNombre());
            return viajeRepository.save(existingViaje);
        } else {
            return null;
        }
    }

    @Override
    public void deleteViaje(Long id) {
        viajeRepository.deleteById(id);
    }
}
