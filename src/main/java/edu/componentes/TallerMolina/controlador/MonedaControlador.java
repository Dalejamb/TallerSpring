package edu.componentes.TallerMolina.controlador;

import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.componentes.TallerMolina.servicio.MonedaServicio;

@RestController
@RequestMapping("/ejercicio/7")
public class MonedaControlador {

    private final MonedaServicio servicio;

    public MonedaControlador(MonedaServicio servicio) {
        this.servicio = servicio;
    }

    // GET http://localhost:8080/ejercicio/7/convertir/{dolares}
    @GetMapping("/convertir/{dolares}")
    public ResponseEntity<HashMap<String, String>> convertir(@PathVariable double dolares) {
        return ResponseEntity.ok(servicio.convertir(dolares));
    }
}