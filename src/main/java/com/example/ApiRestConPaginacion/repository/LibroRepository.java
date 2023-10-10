package com.example.ApiRestConPaginacion.repository;
import com.example.ApiRestConPaginacion.entity.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}

