package com.CrudSpringBoot.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.CrudSpringBoot.demo.modelo.Persona;

public interface inPersonaService {
//Creamos los metodos de tipo crud
	
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete();
}
