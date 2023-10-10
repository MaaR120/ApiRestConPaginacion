package com.example.ApiRestConPaginacion.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base{

    public String titulo;

    public int fecha;

    public String genero;

    public int paginas;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(
            name = "LibroAutor",
            joinColumns = @JoinColumn(name = "Libro_id"),
            inverseJoinColumns = @JoinColumn(name = "Autor_id")
    )
    public List<Autor> autores=new ArrayList<Autor>();


}
