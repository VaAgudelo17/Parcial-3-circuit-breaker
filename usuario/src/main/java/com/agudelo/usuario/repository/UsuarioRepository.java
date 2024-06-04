package com.agudelo.usuario.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agudelo.usuario.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Long> {


}
