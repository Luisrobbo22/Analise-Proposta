package br.com.fiap.analiseProposta.service;

import br.com.fiap.analiseProposta.domain.Cliente;
import br.com.fiap.analiseProposta.repository.ClienteRepository;
import br.com.fiap.analiseProposta.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findById(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException(
                "Cliente não encontrado! id: " + id + " Tipo: " + Cliente.class.getName()));
    }

    public Cliente save(Cliente cliente) {
        try {
            cliente = clienteRepository.save(cliente);
        }catch (Exception e){
            return null;
        }
        return cliente;
    }

}
