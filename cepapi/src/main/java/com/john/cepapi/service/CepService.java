package com.john.cepapi.service;

import com.john.cepapi.model.CepResponse;

public interface CepService {
    CepResponse buscarEndereco(String cep);
}