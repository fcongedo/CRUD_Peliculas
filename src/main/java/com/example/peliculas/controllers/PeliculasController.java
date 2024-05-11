package com.example.peliculas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.peliculas.entities.Pelicula;
import com.example.peliculas.services.IPeliculaService;

@Controller
public class PeliculasController {
	private IPeliculaService service;

	public PeliculasController(IPeliculaService service) {
		this.service = service;

	}

	@GetMapping("/pelicula")
	public String crear(Model model) {
		Pelicula pelicula = new Pelicula();
		model.addAttribute("pelicula", pelicula);
		model.addAttribute("titulo", "Nueva Pelicula");
		return "pelicula";
	}
	@GetMapping("/pelicula/{id}")
	public String crear(@PathVariable(name="id") Long id, Model model) {
		Pelicula pelicula = new Pelicula();
		model.addAttribute("pelicula", pelicula);
		model.addAttribute("titulo", "Nueva Pelicula");
		return "pelicula";
	}
}