package com.example.Tarea1ACFrancisJuanlu.controller;

import com.example.Tarea1ACFrancisJuanlu.model.Match;
import com.example.Tarea1ACFrancisJuanlu.model.Usuario;
import com.example.Tarea1ACFrancisJuanlu.repository.MatchRepository;
import com.example.Tarea1ACFrancisJuanlu.service.MatchService;
import com.example.Tarea1ACFrancisJuanlu.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private MatchService matchService;

    @PostMapping("/crear/{usuario1Id}/{usuario2Id}")
    public ResponseEntity<String> crearMatch(@PathVariable Long usuario1Id, @PathVariable Long usuario2Id) {
        // Verificar si ambos usuarios existen
        Usuario usuario1 = usuarioService.obtenerUsuarioPorId(usuario1Id);
        Usuario usuario2 = usuarioService.obtenerUsuarioPorId(usuario2Id);

        if (usuario1 == null || usuario2 == null) {
            return ResponseEntity.badRequest().body("Al menos uno de los usuarios no existe");
        }

        // Crear el match
        Match match = new Match();
        match.setUsuario1(usuario1);
        match.setUsuario2(usuario2);

        // Guardar el match en la base de datos
        matchService.guardarMatch(match);

        return ResponseEntity.ok("Match creado exitosamente entre " + usuario1.getUsername() + " y " + usuario2.getUsername());
    }


}
