package br.com.fiap.analiseProposta.repository;

import br.com.fiap.analiseProposta.domain.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelaRepository extends JpaRepository<Parcela, Integer> {
}
