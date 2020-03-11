package br.com.fiap.analiseProposta.resource;

import br.com.fiap.analiseProposta.domain.Cliente;
import br.com.fiap.analiseProposta.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @GetMapping(value="/{id}")
    public ResponseEntity<Cliente> find(@PathVariable Integer id) {
        Cliente cliente =  service.findById(id);
        return ResponseEntity.ok().body(cliente);
    }


    @PostMapping(value = "/save")
    public ResponseEntity<String> save (@RequestBody Cliente cliente){
        boolean success = service.save(cliente) != null;
        return  ResponseEntity
                .status(success ? HttpStatus.CREATED: HttpStatus.NOT_MODIFIED)
                .body(success ? "Deu bom" : "Deu ruim");
    }

}
