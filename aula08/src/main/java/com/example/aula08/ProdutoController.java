package com.example.aula08;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService produtoService = new ProdutoService();

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.cadastrarProduto(produto));

    }
    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        List<Produto> produtos = produtoService.listarProdutos();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> listarUm(@PathVariable UUID id) {
        return ResponseEntity.ok(produtoService.listarUmProduto(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable UUID id, @RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.atualizarProduto(id, produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> deletar(@PathVariable UUID id) {
        return ResponseEntity.ok(produtoService.deletarProduto(id));
    }

    @GetMapping("/nome")
    public ResponseEntity<List<Produto>> buscarPeloNome(@RequestParam String nome) {
        return ResponseEntity.ok(produtoService.listarPeloNome(nome));
    }

    @GetMapping("/produto-desconhecido")
    public ResponseEntity<Collection<Produto>> buscarPrecoDesconhecido() {
        return ResponseEntity.ok(produtoService.listarPrecoDesconhecido());
    }
}