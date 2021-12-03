package br.com.senior.Calculator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public static List<String> tokens = new ArrayList<String>();

	public String generateToken() {
		UUID uuid = UUID.randomUUID();
		String token = uuid.toString();
		tokens.add(token);
		return token;
	}

	public boolean isTokenValid(String newToken) {

		return tokens.contains(newToken);

	}

}
