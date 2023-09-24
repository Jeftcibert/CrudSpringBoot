package com.CrudSpringBoot.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.CrudSpringBoot.demo.modelo.Persona;

public interface InPersona  extends CrudRepository<Persona , Integer>{
	

}
