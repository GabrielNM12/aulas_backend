package com.example.aula08;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;

    public UUID getId() {return this.id;}
    public String getNome() {return this.nome;}
    public String getEmail() {return this.email;}

    public void setNome(String nome) {this.nome = nome;}
    public void setEmail(String email) {this.email = email;}

    public Cliente(){}

    public Cliente(String nome, String email){
        this.nome  = nome;
        this.email = email;
    }
}
