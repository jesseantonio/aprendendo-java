package br.com.calculadora.controller;

import java.util.Iterator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculo")
public class CalculatorController {

	@GetMapping(value = "/add")
	public ResponseEntity<Double> adicao(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		Double soma = num1 + num2;
		return ResponseEntity.ok().body(soma);
	}

	@GetMapping(value = "/sub")
	public ResponseEntity<Double> subtracao(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		Double subtracao = num1 - num2;
		return ResponseEntity.ok().body(subtracao);
	}

	@GetMapping(value = "/div")
	public ResponseEntity<Double> divisao(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		Double divisao = num1 / num2;
		return ResponseEntity.ok().body(divisao);
	}

	@GetMapping(value = "/mult")
	public ResponseEntity<Double> multiplicacao(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		Double multiplicacao = num1 * num2;
		return ResponseEntity.ok().body(multiplicacao);
	}

	@GetMapping(value = "/add/numbers")
	public ResponseEntity<Integer> somaNumbers(@RequestParam("numbers") String numbers) {
		int soma = 0;
		String numeros[] = numbers.split(",");
		for (int i = 0; i < numeros.length; i++) {
			soma += Integer.parseInt(numeros[i]);
		}
		return ResponseEntity.ok().body(soma);
	}

	@GetMapping(value = "/sub/numbers")
	public ResponseEntity<Double> subtracaoNumbers(@RequestParam("numbers") String numbers) {

		String numeros[] = numbers.split(",");
		double subtracao = Double.parseDouble(numeros[0]);
		for (int i = 1; i < numeros.length; i++) {

			subtracao -= Double.parseDouble(numeros[i]);
		}
		return ResponseEntity.ok().body(subtracao);
	}

	@GetMapping(value = "/mult/numbers")
	public ResponseEntity<Integer> multiplicacaoNumbers(@RequestParam("numbers") String numbers) {
		int multiplicacao = 1;
		String numeros[] = numbers.split(",");
		for (int i = 0; i < numeros.length; i++) {
			multiplicacao *= Integer.parseInt(numeros[i]);
		}

		return ResponseEntity.ok().body(multiplicacao);
	}

	@GetMapping(value = "/div/numbers")
	public ResponseEntity<Double> divisaoNumbers(@RequestParam("numbers") String numbers) {

		String numeros[] = numbers.split(",");
		double divisao = Double.parseDouble(numeros[0]);
		for (int i = 1; i < numeros.length; i++) {
			divisao /= Double.parseDouble(numeros[i]);
		}

		return ResponseEntity.ok().body(divisao);
	}

}