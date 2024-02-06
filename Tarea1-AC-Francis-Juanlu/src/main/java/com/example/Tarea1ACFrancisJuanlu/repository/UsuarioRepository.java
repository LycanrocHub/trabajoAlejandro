package com.example.Tarea1ACFrancisJuanlu.repository;

import com.example.Tarea1ACFrancisJuanlu.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    List<Usuario>findByUsername(String username);
}