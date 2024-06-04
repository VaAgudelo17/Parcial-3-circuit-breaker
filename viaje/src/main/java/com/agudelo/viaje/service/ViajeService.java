package com.agudelo.viaje.service;

import java.util.List;



import com.agudelo.viaje.entity.Viaje;


public interface ViajeService {
	 List<Viaje> getAllViajes();
	 Viaje getViajeById(Long id);
	 Viaje createViaje(Viaje viaje);
	 Viaje updateViaje(Long id, Viaje viajeDetails);
	 void deleteViaje(Long id);
	
}
