package com.example.Tarea1ACFrancisJuanlu.controller;

import com.example.Tarea1ACFrancisJuanlu.model.Match;
import com.example.Tarea1ACFrancisJuanlu.repository.MatchRepository;
import com.example.Tarea1ACFrancisJuanlu.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/crear")
    public void crearMatch(@RequestBody Match match){
        matchService.guardarMatch(match);
    }

}
