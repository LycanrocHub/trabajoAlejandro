package com.example.Tarea1ACFrancisJuanlu.controller;

import com.example.Tarea1ACFrancisJuanlu.model.Usuario;
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

    /*@Autowired
    private MatchService matchService;*/

    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    /*@PostMapping("/match")
    public void hacerMatch(@RequestBody MatchRequest matchRequest) {
        Usuario usuario1 = usuarioService.obtenerUsuarioPorId(matchRequest.getUsuario1Id());
        Usuario usuario2 = usuarioService.obtenerUsuarioPorId(matchRequest.getUsuario2Id());

        if (usuario1 != null && usuario2 != null) {
            if (!matchService.existeMatch(usuario1, usuario2)) {
                Match match = new Match();
                match.setUsuario1(usuario1);
                match.setUsuario2(usuario2);
                matchService.guardarMatch(match);
            }
        }
    }*/
}