package com.CrudSpringBoot.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CrudSpringBoot.demo.interfaceService.inPersonaService;
import com.CrudSpringBoot.demo.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private inPersonaService service;
	public String listar(Model model) {
		
		List<Persona>personas=service.listar();
		model.addAttribute("persona", personas);
		return "index";
	}
}
