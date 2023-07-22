package com.cad.escola.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cad.escola.Curso;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
	List<Curso> cursos = new ArrayList<Curso>();
	
	public CursoController() {
		Curso curso1 = new Curso("cs", "tiro");
		Curso curso2 = new Curso("it", "cm");
		cursos.add(curso1);
		cursos.add(curso2);
	
		
	}
	
	@GetMapping("")
	public Collection<Curso> carregaCursos() {
		return (cursos);
	}
        
	
}
