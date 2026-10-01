package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		//TODO Implementar o método de consulta da API
		return ResponseEntity.ok().build();
	}
}
