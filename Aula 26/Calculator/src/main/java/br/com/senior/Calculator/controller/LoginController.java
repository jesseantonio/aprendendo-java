package br.com.senior.Calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.Calculator.dto.UserDto;
import br.com.senior.Calculator.exception.LoginException;
import br.com.senior.Calculator.service.LoginService;

@RestController
@RequestMapping("/Calculator/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	private UserDto userDto = new UserDto("Mario", "123");

	@PostMapping
	public ResponseEntity<String> login(@RequestBody UserDto userDtoRequest) {

		if (userDtoRequest.user.equalsIgnoreCase(userDto.user) && userDtoRequest.password.equals(userDto.password)) {
			final String token = loginService.generateToken();
			return new ResponseEntity<>(token, HttpStatus.OK);
		} else {
			throw new LoginException();
		}

	}

}
