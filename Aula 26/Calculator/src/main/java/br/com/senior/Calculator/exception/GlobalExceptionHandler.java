package br.com.senior.Calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    /*
    * Aqui capturamos as determinadas exceptions que ocorreriam no controller e as tratamos
    * */
    @ExceptionHandler({LoginException.class})
    public ResponseEntity<String> exceptionHandler(Exception ex, WebRequest request){
        return new ResponseEntity<>("An exception ocurred during the execution, caused by:" + ex.getCause(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
