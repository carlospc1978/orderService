package br.com.seteideias.orderservice.repository;

import br.com.seteideias.orderservice.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
