package com.celiosato.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias") //end point categorias
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)// verbos GET, POST, DELETE
	public String listar(){
		return "REST esta funcionando";
		
	}
	
}
