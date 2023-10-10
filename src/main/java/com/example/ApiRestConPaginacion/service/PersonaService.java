package com.example.ApiRestConPaginacion.service;

import com.example.ApiRestConPaginacion.entity.Persona;
import jakarta.transaction.Transactional;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> search(String filtro) throws Exception;

    List<Persona> searchNative(String filtro) throws Exception;

    List<Persona> searchQuery(String nombre, String apellido) throws Exception;
}
