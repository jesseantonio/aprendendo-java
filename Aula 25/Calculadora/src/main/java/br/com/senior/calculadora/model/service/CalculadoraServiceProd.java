package br.com.senior.calculadora.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.senior.calculadora.model.profile.CalculadoraProfile;

@Service
@Profile("prod")
public class CalculadoraServiceProd implements CalculadoraService {

	@Autowired
	CalculadoraProfile calculadoraProfile;

	@Override
	public Boolean isValid(String senha) {
		return calculadoraProfile.getSenha().equals(senha);
	}

}
