package com.example.aula08;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.UUID;
import java.util.List;


public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    List<Cliente> findByNome(String nome);

    @Query("SELECT c FROM Cliente c WHERE c.email = ''")
    Collection<Cliente> findByUnknownEmail();
}
