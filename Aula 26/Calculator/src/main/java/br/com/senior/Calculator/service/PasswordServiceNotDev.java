package br.com.senior.Calculator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.senior.Calculator.exception.LoginException;

@Profile("!dev")
@Service
public class PasswordServiceNotDev implements PasswordService {

	@Value("${br.com.senior.calculator.password}")
	private String password;

	@Override
	public boolean validatePassword(String password) {
		if (password != null) {
			return password.equals(this.password);

		} else {
			throw new LoginException();
		}

	}

	public String getPassword() {
		return password;
	}

}