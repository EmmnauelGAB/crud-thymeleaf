package com.abge.primeraweb.service;

import com.abge.primeraweb.entities.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerTodos();

    Persona obtenerPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);

    long contarPersonas();
}
