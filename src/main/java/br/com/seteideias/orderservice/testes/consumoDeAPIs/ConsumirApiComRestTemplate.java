package br.com.seteideias.orderservice.testes.consumoDeAPIs;

import br.com.seteideias.orderservice.domain.Cliente;
import ch.qos.logback.classic.util.LogbackMDCAdapter;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.http.HttpResponse;

public class ConsumirApiComRestTemplate {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        UriComponents http = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("")
                .path("")
                .build();

//        restTemplate.getForEntity("https://www.globo.com/", String.class);
    restTemplate.getForObject("https://www.globo.com/", Object.class);

//        restTemplate.

        System.out.println("ooi");


    }

}
