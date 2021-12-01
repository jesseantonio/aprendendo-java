package br.com.senior.calculadora.model.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculadoraService {

	Boolean isValid(String senha);

}
