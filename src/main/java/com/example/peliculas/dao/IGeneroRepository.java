package com.example.peliculas.dao;

import com.example.peliculas.entities.Genero;

public interface IGeneroRepository {

	public void save(Genero genero);
	public Genero findById(long id);
}
