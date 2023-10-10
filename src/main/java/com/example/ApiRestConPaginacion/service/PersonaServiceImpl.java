package com.example.ApiRestConPaginacion.service;

import com.example.ApiRestConPaginacion.entity.Persona;
import com.example.ApiRestConPaginacion.repository.BaseRepository;
import com.example.ApiRestConPaginacion.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    protected PersonaRepository personaRepository;
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Transactional
    @Override
    public List<Persona> search(String filtro) throws Exception{
        try{
            List<Persona> personas=personaRepository.search(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public List<Persona> searchNative(String filtro) throws Exception{
        try{
            List<Persona> personas=personaRepository.searchNative(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public List<Persona> searchQuery(String nombre, String apellido) throws Exception{
        try{
            List<Persona> personas=personaRepository.findByNombreContainingOrApellidoContaining(nombre, apellido);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
