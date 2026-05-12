package com.example.aula08;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente listarUmCliente(UUID id) {
        return clienteRepository.findById(id).get();
    }

    public Cliente atualizarCliente(UUID id, Cliente cliente) {
        Cliente existente = clienteRepository.findById(id).get();
        existente.setNome(cliente.getNome());
        existente.setEmail(cliente.getEmail());
        return clienteRepository.save(existente);
    }

    public Cliente deletarCliente(UUID id) {
        Cliente existente = clienteRepository.findById(id).get();
        clienteRepository.delete(existente);
        return existente;
    }

    public List<Cliente> listarPeloNome(String nome) {
        return clienteRepository.findByNome(nome);
    }

    public Collection<Cliente> listarEmailDesconhecido() {
        return clienteRepository.findByUnknownEmail();
    }


}
