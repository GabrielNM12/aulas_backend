package com.example.aula08;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService service = new UsuarioService();

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        List<Usuario> usuarios = service.listar();

        if (usuarios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> adicionar(@RequestBody Usuario usuario) {
        Usuario novo = service.adicionar(usuario);
        return ResponseEntity.status(201).body(novo);
    }

    @GetMapping("/{index}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int index) {
        Usuario usuario = service.buscarPorId(index);

        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/{index}")
    public ResponseEntity<Usuario> atualizar(@PathVariable int index, @RequestBody Usuario usuario) {
        Usuario atualizado = service.atualizar(index, usuario);

        if (atualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{index}")
    public ResponseEntity<Usuario> remover(@PathVariable int index) {
        Usuario removido = service.remover(index);

        if (removido == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(removido);
    }
}