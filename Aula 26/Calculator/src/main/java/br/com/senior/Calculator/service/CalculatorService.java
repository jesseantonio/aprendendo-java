package br.com.senior.Calculator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public float add(float num1, float num2) {

		return num1 + num2;
	}

	public float sub(float num1, float num2) {
		return num1 - num2;
	}

	public float div(float num1, float num2) {
		return num1 / num2;
	}

	public float mult(float num1, float num2) {
		return num1 * num2;
	}

	public Float addLista(String numbers) {

		String[] numbersArray = numbers.split(",");
		List<Float> numbersConverted = new ArrayList<>();
		for (int i = 0; i < numbersArray.length; i++) {
			numbersConverted.add(Float.parseFloat(numbersArray[i]));
		}
		Float resultado = 0f;
		for (int i = 0; i < numbersConverted.size(); i++) {
			resultado += numbersConverted.get(i);

		}
		return resultado;
	}

	public Float subLista(String numbers) {

		String[] numbersArray = numbers.split(",");
		List<Float> numbersConverted = new ArrayList<>();
		for (int i = 0; i < numbersArray.length; i++) {
			numbersConverted.add(Float.parseFloat(numbersArray[i]));
		}
		Float resultado = 0f;
		for (int i = 0; i < numbersConverted.size(); i++) {
			resultado -= numbersConverted.get(i);

		}
		return resultado;

	}

	public Float divLista(String numbers) {

		String[] numbersArray = numbers.split(",");
		List<Float> numbersConverted = new ArrayList<>();
		for (int i = 0; i < numbersArray.length; i++) {
			numbersConverted.add(Float.parseFloat(numbersArray[i]));
		}
		Float resultado = 0f;
		for (int i = 0; i < numbersConverted.size(); i++) {
			resultado /= numbersConverted.get(i);
		}
		return resultado;
	}

	public Float multLista(String numbers) {

		String[] numbersArray = numbers.split(",");
		List<Float> numbersConverted = new ArrayList<>();
		for (int i = 0; i < numbersArray.length; i++) {
			numbersConverted.add(Float.parseFloat(numbersArray[i]));
		}
		Float resultado = 1f;
		for (int i = 0; i < numbersConverted.size(); i++) {
			resultado *= numbersConverted.get(i);
		}
		return resultado;
	}
}
