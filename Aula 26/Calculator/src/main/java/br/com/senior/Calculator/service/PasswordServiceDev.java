package br.com.senior.Calculator.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class PasswordServiceDev implements PasswordService {

	@Override
	public boolean validatePassword(String password) {
		return true;
	}

}
