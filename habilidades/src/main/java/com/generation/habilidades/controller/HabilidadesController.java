package com.generation.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/habilidades")
@RestController
public class HabilidadesController {
	
	@GetMapping 
	public String habilidades() {
		return "Hello World!\n"
				+ "As habilidades e mentalidades que utilizei para realizar essa atividade foram:"
				+ "\nOrientação ao detalhe,"
				+ "\nMentalidadade de crescimento,"
				+ "\nPersistência.";
	}
}
