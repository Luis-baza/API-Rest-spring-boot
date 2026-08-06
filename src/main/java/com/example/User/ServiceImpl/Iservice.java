package com.example.User.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User.Repository.UsuarioRepository;
import com.example.User.Service.UsuarioService;
import com.example.User.model.Usuario;

@Service
public class Iservice implements UsuarioService{

    @Autowired
    UsuarioRepository repository;

    @Override
    public List<Usuario> listar() {
       
        return repository.findAll();

    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
