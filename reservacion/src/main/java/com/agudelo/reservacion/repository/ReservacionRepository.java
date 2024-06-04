package com.agudelo.reservacion.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.agudelo.reservacion.entity.Reservacion;

@Repository
public interface ReservacionRepository extends CrudRepository<Reservacion, Long> {

}
