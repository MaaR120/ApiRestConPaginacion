package com.example.ApiRestConPaginacion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona extends Base{

    public String nombre;

    public String apellido;

    public int dni;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "domicilio_id")
    public Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Libro> libroList=new ArrayList<Libro>();

}
