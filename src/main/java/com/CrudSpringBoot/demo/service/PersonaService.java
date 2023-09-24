package com.CrudSpringBoot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.CrudSpringBoot.demo.interfaceService.inPersonaService;
import com.CrudSpringBoot.demo.interfaces.InPersona;
import com.CrudSpringBoot.demo.modelo.Persona;

//Implementamos los metodos que creamos en las interfaces
public class PersonaService implements inPersonaService{
	
	@Autowired
	private InPersona data;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
