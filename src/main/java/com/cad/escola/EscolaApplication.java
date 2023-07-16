package com.cad.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
		Curso curso = new Curso("AM", "Analista de dado");
		
		curso.setValor(1.70);
		
		System.out.println ();
		System.out.println ();
	}

}
