package com.example.ApiRestConPaginacion.service;

import com.example.ApiRestConPaginacion.entity.Libro;
import com.example.ApiRestConPaginacion.entity.Localidad;
import com.example.ApiRestConPaginacion.repository.BaseRepository;
import com.example.ApiRestConPaginacion.repository.LibroRepository;
import com.example.ApiRestConPaginacion.repository.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements BaseService<Localidad,Long>{
    @Autowired
    protected LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}