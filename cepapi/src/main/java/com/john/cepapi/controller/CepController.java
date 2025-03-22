package com.john.cepapi.controller;

import com.john.cepapi.model.CepResponse;
import com.john.cepapi.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
@CrossOrigin(origins = "*")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public CepResponse buscarCep(@PathVariable String cep) {
        return cepService.buscarEndereco(cep);
    }
}