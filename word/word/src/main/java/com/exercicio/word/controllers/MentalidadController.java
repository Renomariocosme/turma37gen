package com.exercicio.word.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requisicao")
public class MentalidadController {
	@GetMapping("/mentalidade")
	public String mentalidadeHabilidade () {
		return "Persistencia e orientação ao detalhe";
	}
	@GetMapping("/objetivo")
	public String objetivoAprendizagem() {
		return "Aprendi MYsql e suas aplicações e estou tentando aprender a usar spring";
	}
	
}
