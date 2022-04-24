package br.com.seteideias.orderservice.controller;

import br.com.seteideias.orderservice.domain.Cliente;
import br.com.seteideias.orderservice.repository.ClienteRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Log4j2
@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public Iterable<Cliente> list() {

        Iterable<Cliente> all = repository.findAll();
        all.forEach(cliente -> new Cliente());

        return all;
    }

    @GetMapping(path = "/{id}")
    public Cliente view(@PathVariable String id) {

        Optional<Cliente> cliente = repository.findById(id);


        if (cliente.isPresent()) {
            return cliente.get();
        }

        Cliente cliente1 = new Cliente();
        cliente1.setId("cliente.get().getId()");
        cliente1.setNomeTeste("cliente.get().getNomeTeste()");

        return cliente1;
    }

    @PostMapping("/post/")
    public void postarCliente(@RequestBody Cliente cliente) {
        log.info("cliente " + cliente.toString());
        repository.save(cliente);
    }
}