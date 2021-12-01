package br.com.senior.calculadora.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.calculadora.model.service.CalculadoraService;

@RestController
@RequestMapping(value = "/calc")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;

	@GetMapping("/add")
	public ResponseEntity<?> add(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2,
			@RequestParam(value = "senha", required = false) String senha) {

		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 + num2);
		}
		return ResponseEntity.ok().body("nao");
	}

	@GetMapping("/addNumbers")
	public ResponseEntity<?> addNumbers(@RequestParam(value = "numbers") String numbers,
			@RequestParam(value = "senha", required = false) String senha) {

		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {
			String[] number = numbers.split(",");
			Double valor = 0.0;
			for (String string : number) {
				valor += Double.parseDouble(string);
			}
			return ResponseEntity.ok().body(valor);
		}
		return ResponseEntity.ok().body("nao");
	}

	@GetMapping("/sub")
	public ResponseEntity<?> sub(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2,
			@RequestParam(value = "senha", required = false) String senha) {
		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 - num2);
		}
		return ResponseEntity.ok().body("nao");
	}

	@GetMapping("/subNumbers")
	public ResponseEntity<?> subNumbers(@RequestParam(value = "numbers") String numbers,
			@RequestParam(value = "senha", required = false) String senha) {

		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {
			String[] number = numbers.split(",");
			Double valor = Double.parseDouble(number[0]);
			for (int i = 1; i < number.length; i++) {
				valor -= Double.parseDouble(number[i]);
			}
			return ResponseEntity.ok().body(valor);
		}
		return ResponseEntity.ok().body("nao");

	}

	@GetMapping("/div")
	public ResponseEntity<?> div(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2,
			@RequestParam(value = "senha", required = false) String senha) {
		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 / num2);
		}
		return ResponseEntity.ok().body("nao");
	}

	@GetMapping("/divNumbers")
	public ResponseEntity<?> divNumbers(@RequestParam(value = "numbers") String numbers,
			@RequestParam(value = "senha", required = false) String senha) {
		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {

			String[] number = numbers.split(",");
			Double valor = Double.parseDouble(number[0]);
			for (int i = 1; i < number.length; i++) {
				valor /= Double.parseDouble(number[i]);
			}
			return ResponseEntity.ok().body(valor);
		}
		return ResponseEntity.ok().body("nao");
	}

	@GetMapping("/mult")
	public ResponseEntity<?> mult(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2,
			@RequestParam(value = "senha", required = false) String senha) {
		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 * num2);
		}
		return ResponseEntity.ok().body("nao");
	}

	@GetMapping("/multNumbers")
	public ResponseEntity<?> multNumbers(@RequestParam(value = "numbers") String numbers,
			@RequestParam(value = "senha", required = false) String senha) {
		if (senha == null) {
			senha = " ";
		}
		if (calculadoraService.isValid(senha)) {

			String[] number = numbers.split(",");
			Double valor = 1.0;
			for (String string : number) {
				valor *= Double.parseDouble(string);
			}
			return ResponseEntity.ok().body(valor);
		}
		return ResponseEntity.ok().body("nao");
	}

}
