package br.com.senior.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Isbn Invalida")
public class LivroIsbnException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public LivroIsbnException(String msg) {
		super(msg);
	}
}
