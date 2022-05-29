package br.com.seteideias.orderservice.repository;

import br.com.seteideias.orderservice.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
