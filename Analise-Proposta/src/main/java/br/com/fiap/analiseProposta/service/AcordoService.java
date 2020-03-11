package br.com.fiap.analiseProposta.service;

import br.com.fiap.analiseProposta.domain.Renegociacao;
import br.com.fiap.analiseProposta.repository.AcordoRepository;
import br.com.fiap.analiseProposta.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AcordoService {

    @Autowired
    private AcordoRepository acordoRepository;


    public Renegociacao findById(Integer id) {
        Optional<Renegociacao> renegociacao = acordoRepository.findById(id);
        return renegociacao.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Renegociacao.class.getName()));
    }

}
