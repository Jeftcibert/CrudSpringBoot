package com.CrudSpringBoot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBoot.demo.interfaceService.inPersonaService;
import com.CrudSpringBoot.demo.interfaces.InPersona;
import com.CrudSpringBoot.demo.modelo.Persona;


@Service
//Implementamos los metodos que creamos en las interfaces
public class PersonaService implements inPersonaService{
	
	@Autowired 
	private InPersona data;

	@Override
	public List<Persona> listar() {

		return (List<Persona>)data.findAll();
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
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
