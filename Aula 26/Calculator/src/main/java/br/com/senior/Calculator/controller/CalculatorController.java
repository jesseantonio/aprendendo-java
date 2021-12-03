package br.com.senior.Calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.Calculator.exception.WrongPasswordException;
import br.com.senior.Calculator.service.CalculatorService;
import br.com.senior.Calculator.service.PasswordService;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@Autowired
	private PasswordService passwordService;

	// if senha não informada, lançar uma passwordNotFoundException // 400
	// if senha incorreta, lançar uma Wrong PasswordException //401

	@GetMapping("/add")
	public Float add(@RequestParam(required = false) Float num1, @RequestParam(required = false) Float num2,
			@RequestParam(required = false) String numbers, @RequestParam(required = false) String password) {

		if (passwordService.validatePassword(password)) {

			if (num1 == null || num2 == null) {
				return calculatorService.addLista(numbers);
			} else {
				return calculatorService.add(num1, num2);
			}

		}
		throw new WrongPasswordException();
	}

	@GetMapping("/sub")
	public Float sub(@RequestParam(required = false) Float num1, @RequestParam(required = false) Float num2,
			@RequestParam(value = "numbers", required = false) String numbers,
			@RequestParam(value = "password", required = false) String password) {

		if (passwordService.validatePassword(password)) {

			if (num1 == null || num2 == null && numbers != null) {

				return calculatorService.subLista(numbers);

			} else {
				return calculatorService.sub(num1, num2);
			}

		}
		return null;
	}

	@GetMapping("/div")
	public ResponseEntity<Float> div(@RequestParam(required = false) Float num1,
			@RequestParam(required = false) Float num2, @RequestParam(required = false) String numbers,
			@RequestParam(value = "password", required = false) String password) {

		if (passwordService.validatePassword(password)) {

			if (num1 == null || num2 == null || num1 == 0 || num2 == 0) {
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			} else if (numbers != null) {
				return new ResponseEntity<>(calculatorService.divLista(numbers), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(calculatorService.div(num1, num2), HttpStatus.OK);
			}
		}
		return null;
	}

	@GetMapping("/mult")
	public Float mult(@RequestParam(required = false) Float num1, @RequestParam(required = false) Float num2,
			@RequestParam(required = false) String numbers,
			@RequestParam(value = "password", required = false) String password) {

		if (passwordService.validatePassword(password)) {

			if ((num1 == null || num2 == null) && numbers != null) {

				return calculatorService.multLista(numbers);

			} else {
				return calculatorService.mult(num1, num2);
			}
		}
		return null;
	}

}
