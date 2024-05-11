package com.example.peliculas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.peliculas.dao.IPeliculaRepository;
import com.example.peliculas.entities.Pelicula;
@Service
public class PeliculaService implements IPeliculaService {

	private IPeliculaRepository repo;

	@Override
	public void save(Pelicula pelicula) {
		repo.save(pelicula);

	}

	@Override
	public Pelicula findById(Long id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Pelicula> findAll() {

		return (List<Pelicula>) repo.findAll();
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);

	}

}