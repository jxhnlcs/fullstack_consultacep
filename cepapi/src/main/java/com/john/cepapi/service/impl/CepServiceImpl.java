package com.john.cepapi.service.impl;

import com.john.cepapi.model.CepResponse;
import com.john.cepapi.service.CepService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepServiceImpl implements CepService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public CepResponse buscarEndereco(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return restTemplate.getForObject(url, CepResponse.class);
    }
}