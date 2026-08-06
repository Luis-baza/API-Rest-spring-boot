package com.example.User.Service;

import java.util.List;

import com.example.User.model.Usuario;

public interface UsuarioService {
    
    List<Usuario> listar();
    Usuario guardar(Usuario usuario);
    Usuario buscarPorId(Long id);
    void eliminar(Long id);
}
