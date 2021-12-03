package br.com.senior.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.dto.UserDTO;
import br.com.senior.service.LoginService;

@RestController
@RequestMapping(value = "/login")
@Profile("prod")
public class LoginController {

	public static List<String> uuid = new ArrayList<>();
	
	@Autowired
	private LoginService ls;
	
	@PostMapping
	public ResponseEntity<String> login(@RequestBody br.com.senior.dto.UserDTO user){
		if(user.user.equals(ls.user) && user.password.equals(ls.password)) {
			UUID token = ls.gerarToken();
			uuid.add(token.toString());
			return ResponseEntity.ok().body(token.toString());
		}
		else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
}
