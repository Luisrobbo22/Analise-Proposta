package br.com.fiap.analiseProposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.analiseProposta.domain.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Integer> {
}
