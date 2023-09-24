package com.CrudSpringBoot.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CrudSpringBoot.demo.interfaceService.inPersonaService;
import com.CrudSpringBoot.demo.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private inPersonaService service;

	//Annotation correspondiente @GetMapping y (Le damos una ruta)
	@GetMapping("/listar")
	public String listar(Model model) {

		List<Persona> persona = service.listar();
//		con la palabra model y el addAttibute enviamos la lista al formulario
		model.addAttribute("personas", persona);
		return "index";
	}
}
