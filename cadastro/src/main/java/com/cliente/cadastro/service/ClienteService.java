package com.cliente.cadastro.service;

import com.cliente.cadastro.entity.Cliente;
import com.cliente.cadastro.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Builder
@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> consultarCliente() {
        return clienteRepository.findAll();
    }

//    public Optional<Cliente> consultarPorId(Long id) {
//        return clienteRepository.findById(id);
//    }
}
