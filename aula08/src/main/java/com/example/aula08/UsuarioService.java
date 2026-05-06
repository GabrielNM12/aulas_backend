package com.example.aula08;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> listar() {
        return usuarios;
    }

    public Usuario adicionar(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario atualizar(int index, Usuario usuario) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.set(index, usuario);
            return usuario;
        }
        return null;
    }

    public Usuario remover(int index) {
        if (index >= 0 && index < usuarios.size()) {
            return usuarios.remove(index);
        }
        return null;
    }

    public Usuario buscarPorId(int index) {
        if (index >= 0 && index < usuarios.size()) {
            return usuarios.get(index);
        }
        return null;
    }
}