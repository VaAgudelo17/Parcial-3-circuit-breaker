
package com.agudelo.viaje.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import com.agudelo.viaje.entity.Viaje;

@Repository
public interface ViajeRepository extends CrudRepository<Viaje, Long> {
}
