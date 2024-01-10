package com.abge.primeraweb;

import com.abge.primeraweb.entities.Persona;
import com.abge.primeraweb.repository.PersonaRepository;
import com.abge.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringBootApplication {

	@Autowired
	private PersonaService personaService;


	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringBootApplication.class, args);

	}

//	@Override
//	public void run(String... args) throws Exception {
//		personaService.crearPersona(new Persona(6L, "Joselo", 25));
//		personaService.crearPersona(new Persona(7L, "Juan", 25));
//		personaService.crearPersona(new Persona(8L, "Ruben", 25));
//		personaService.crearPersona(new Persona(9L, "Adriana", 25));
//
//		// Numero de personas
//		System.out.println("Numero de perosnas en la tabla : " + personaService.contarPersonas());
//
//		// Mostramos la lista de personas
//		List<Persona> personas = personaService.obtenerTodos();
//		personas.forEach(p -> System.out.println(("Nombre de la persona : " + p.getNombre())));
//
//	}
}

