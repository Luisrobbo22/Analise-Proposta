package br.com.fiap.analiseProposta.service;

import br.com.fiap.analiseProposta.domain.Contrato;
import br.com.fiap.analiseProposta.repository.ContratoRepository;
import br.com.fiap.analiseProposta.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    public Contrato findById(Integer id) {
        Optional<Contrato> contrato = contratoRepository.findById(id);
        return contrato.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Contrato.class.getName()));
    }

}


