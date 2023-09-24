package com.CrudSpringBoot.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CrudSpringBoot.demo.modelo.Persona;


@Repository

public interface InPersona  extends CrudRepository<Persona , Integer>{
	

}
