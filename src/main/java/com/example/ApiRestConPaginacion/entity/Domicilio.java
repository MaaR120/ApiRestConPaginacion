package com.example.ApiRestConPaginacion.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Domicilio extends Base{

    public String calle;

    public int numero;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "localidad_id")
    public Localidad localidad;

}
