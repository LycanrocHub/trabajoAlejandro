package com.example.Tarea1ACFrancisJuanlu.service;


import com.example.Tarea1ACFrancisJuanlu.model.Match;
import com.example.Tarea1ACFrancisJuanlu.model.Usuario;
import com.example.Tarea1ACFrancisJuanlu.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    public boolean existeMatch(Usuario usuario1, Usuario usuario2) {
        return matchRepository.existsByUsuario1AndUsuario2(usuario1, usuario2) || matchRepository.existsByUsuario1AndUsuario2(usuario2, usuario1);
    }

    public Match guardarMatch(Match match) {
        return matchRepository.save(match);
    }
}