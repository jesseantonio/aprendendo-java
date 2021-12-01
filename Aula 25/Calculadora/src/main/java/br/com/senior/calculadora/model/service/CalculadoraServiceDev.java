package br.com.senior.calculadora.model.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class CalculadoraServiceDev implements CalculadoraService {

	@Override
	public Boolean isValid(String senha) {
		return true;
	}

}
