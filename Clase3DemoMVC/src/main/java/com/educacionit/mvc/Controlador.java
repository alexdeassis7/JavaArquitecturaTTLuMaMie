package com.educacionit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//con esta anotacion indicamos a Spring que esta clase es una controlador
public class Controlador {

//	localhost:8080/Clase3DemoMVC/
	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}
}
