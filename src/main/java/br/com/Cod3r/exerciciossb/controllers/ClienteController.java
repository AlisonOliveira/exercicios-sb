package br.com.Cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Cod3r.exerciciossb.models.Cliente;

@RestController 
class ClienteController {
	
	@GetMapping(path = "/clientes/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro","123.456.789-00");
		
	}

}
