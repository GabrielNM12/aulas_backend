package com.example.aula08;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private Float preco;

    public String getNome() {return this.nome;}
    public Float getPreco() {return this.preco;}

    public void setNome(String nome) {this.nome = nome;}
    public void setPreco(Float preco) {this.preco = preco;}

    public Produto(){}

    public Produto(String nome, float preco){
        this.nome  = nome;
        this.preco = preco;
    }
}
