package br.com.senior.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class LoginService {

	@Value("${br.com.senior.user}")
	public String user;
	
	@Value("${br.com.senior.password}")
	public String password;
	
	public UUID gerarToken() {
		UUID uuid = UUID.randomUUID();
		return uuid;
	}
}
