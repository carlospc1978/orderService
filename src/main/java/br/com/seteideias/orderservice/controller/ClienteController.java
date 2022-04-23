package br.com.seteideias.orderservice.controller;

import br.com.seteideias.orderservice.domain.Cliente;
import br.com.seteideias.orderservice.repository.ClienteRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Log4j2
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public ResponseEntity<Cliente> list() {

        Iterable<Cliente> list = repository.findAll();

        return ResponseEntity.ok(list.iterator().next());
    }

    @GetMapping(path = "/{id}")
    public Cliente view(@PathVariable String id) {

        Optional<Cliente> byId = repository.findById(id);

        if (byId.isPresent()) {
            log.info("byId " + byId);
            return byId.get();

        } else {
            log.info("byId " + byId);
            return null;
        }


    }
}
