package br.com.senior.Calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Senha incorreta")
public class WrongPasswordException extends RuntimeException {

}
