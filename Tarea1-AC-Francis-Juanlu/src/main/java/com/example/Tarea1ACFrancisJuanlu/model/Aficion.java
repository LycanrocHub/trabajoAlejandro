package com.example.Tarea1ACFrancisJuanlu.model;

import com.example.Tarea1ACFrancisJuanlu.enums.AficionNombre;
import jakarta.persistence.*;
@Entity
@Table(name = "hobbie")
public class Aficion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private AficionNombre nombreAficion;

    public Aficion(){}

    public Aficion(Integer id, AficionNombre nombreAficion) {
        this.id = id;
        this.nombreAficion = nombreAficion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AficionNombre getNombreAficion() {
        return nombreAficion;
    }

    public void setNombreAficion(AficionNombre nombreAficion) {
        this.nombreAficion = nombreAficion;
    }
}