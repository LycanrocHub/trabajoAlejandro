package com.example.Tarea1ACFrancisJuanlu.model;

import jakarta.persistence.*;
@Entity
@Table(name = "user_match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Usuario usuario1;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user2_id")
    private Usuario usuario2;

    public Match() {}

    public Match(Long id, Usuario usuario1, Usuario usuario2) {
        this.id = id;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }
}
