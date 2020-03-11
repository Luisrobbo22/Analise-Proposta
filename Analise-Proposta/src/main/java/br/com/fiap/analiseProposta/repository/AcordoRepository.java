package br.com.fiap.analiseProposta.repository;

import br.com.fiap.analiseProposta.domain.Renegociacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcordoRepository extends JpaRepository<Renegociacao, Integer> {

}
