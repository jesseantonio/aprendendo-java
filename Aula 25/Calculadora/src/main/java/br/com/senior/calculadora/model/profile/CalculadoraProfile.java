package br.com.senior.calculadora.model.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraProfile {

	@Value("${br.com.senior.calculadora.senha}")
	private String senha;

	public String getSenha() {
		return senha;
	}

}
