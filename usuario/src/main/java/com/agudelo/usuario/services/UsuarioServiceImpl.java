package com.agudelo.usuario.services;

import java.util.Optional; 
import org.springframework.stereotype.Service;
import com.agudelo.usuario.entity.Usuario;
import com.agudelo.usuario.repository.UsuarioRepository;
import io.vavr.collection.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

 
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        return optionalUsuario.orElse(null);
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Long id, Usuario usuarioDetails) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuarioExistente = optionalUsuario.get();
            usuarioExistente.setNombre(usuarioDetails.getNombre());
            usuarioExistente.setApellido(usuarioDetails.getApellido());
            return usuarioRepository.save(usuarioExistente);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> obtenerUsuariosDisponibles() {
        return List.ofAll(usuarioRepository.findAll());
    }

	
}