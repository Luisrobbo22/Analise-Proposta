package br.com.fiap.analiseProposta.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.analiseProposta.domain.Renegociacao;
import br.com.fiap.analiseProposta.service.AcordoService;

@RestController
@RequestMapping(value = "/renegociacao")
public class RenegociacaoResource {

	private AcordoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id){
		Renegociacao renegociacao = service.findById(id);
		return ResponseEntity.ok().body(renegociacao);
	}
}
