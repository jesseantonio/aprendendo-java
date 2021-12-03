package br.com.senior.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(LivroDescricaoException.class)
	public ResponseEntity<StandardError> wrongDescricao(LivroDescricaoException e, HttpServletRequest request){
		String error = "Field 'Descricao' too high";
		HttpStatus status = HttpStatus.NOT_ACCEPTABLE; 
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.ok().body(err);
	}
}
