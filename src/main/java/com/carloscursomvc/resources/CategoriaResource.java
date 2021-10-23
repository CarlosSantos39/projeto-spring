package com.carloscursomvc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest esta Funcionando!";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String usar() {
		return "Rest esta Funcionando!";
	}
}
