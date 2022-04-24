package br.com.seteideias.orderservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cliente")
public class Cliente {

    @Id
    private String id;

    private String nomeTeste;
}
