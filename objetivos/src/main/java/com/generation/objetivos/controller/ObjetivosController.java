package com.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/objetivos")
@RestController
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return "Hello World!!"
				+ "\nMeus objetivos de aprendizagem para essa semana são:"
				+ "\n1) Melhorar minha atenção aos detalhes,"
				+ "\n2) Melhorar minha comunicação,"
				+ "\n3) Trabalhar melhor em equipe.";
	}
}
