package br.com.Cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Cod3r.exerciciossb.models.Calculadora;


@RestController
@RequestMapping("/calcular")
public class CalculadoraController {
	
	// url: calculadora/somar/10/20
	// url: calculadora/sutrair?a=10&b=20
	
	@GetMapping("/{num1}/{num2}")
	public int calcularSoma(@PathVariable int num1, @PathVariable int num2) {
		
		return  num1 + num2;
	}
	

}
