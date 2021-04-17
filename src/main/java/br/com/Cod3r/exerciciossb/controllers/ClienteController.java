package br.com.Cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.Cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
class ClienteController {
	
	@GetMapping("qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro","123.456.789-00");
		
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Alison","123.333.030-21");
	}
	
	@GetMapping
	public Cliente obeterClientePorId2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id,"Cristiane","500.123.454-50");
	}

}
