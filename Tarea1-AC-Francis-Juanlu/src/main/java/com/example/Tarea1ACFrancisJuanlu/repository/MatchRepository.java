package com.example.Tarea1ACFrancisJuanlu.repository;

import com.example.Tarea1ACFrancisJuanlu.model.Match;
import com.example.Tarea1ACFrancisJuanlu.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match,Long> {
    boolean existsByUsuario1AndUsuario2(Usuario usuario1, Usuario usuario2);
}