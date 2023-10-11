package com.example.ApiRestConPaginacion.service;

import com.example.ApiRestConPaginacion.entity.Persona;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> search(String filtro) throws Exception;

    List<Persona> searchPaginado(String filtro, Pageable pageable) throws Exception;


    List<Persona> searchNative(String filtro) throws Exception;

    List<Persona> searchNativePaginado(String filtro, Pageable pageable) throws Exception;


    List<Persona> searchQuery(String nombre, String apellido) throws Exception;

    List<Persona> searchQueryPaginado(String nombre, String apellido, Pageable pageable) throws Exception;

}
