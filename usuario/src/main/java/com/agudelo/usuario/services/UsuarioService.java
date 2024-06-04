package com.agudelo.usuario.services;



import com.agudelo.usuario.entity.Usuario;

import io.vavr.collection.List;

public interface UsuarioService {
	 Usuario obtenerUsuario(Long id);
	 Usuario crearUsuario(Usuario usuario);
	 Usuario actualizarUsuario(Long id, Usuario usuarioDetails);
	 void eliminarUsuario(Long id);
	 List<Usuario> obtenerUsuariosDisponibles();
   

}
