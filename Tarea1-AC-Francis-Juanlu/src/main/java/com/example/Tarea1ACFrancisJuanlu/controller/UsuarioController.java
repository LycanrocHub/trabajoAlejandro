package com.example.Tarea1ACFrancisJuanlu.controller;

import com.example.Tarea1ACFrancisJuanlu.model.Usuario;
import com.example.Tarea1ACFrancisJuanlu.service.MatchService;
import com.example.Tarea1ACFrancisJuanlu.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin({"*"})
@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerUsuarios();
    }


}