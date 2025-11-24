package edu.componentes.TallerMolina.controlador;


import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.componentes.TallerMolina.servicio.TemperaturaServicio;

@RestController
@RequestMapping("/ejercicio/2")
public class TemperaturaControlador {

    private final TemperaturaServicio servicio;

    public TemperaturaControlador(TemperaturaServicio servicio) {
        this.servicio = servicio;
    }

    // GET  http://localhost:8080/ejercicio/2/convertir/25
    @GetMapping("/convertir/{celsius}")
    public ResponseEntity<HashMap<String, String>> convertir(@PathVariable double celsius) {
        return ResponseEntity.ok(servicio.convertir(celsius));
    }
}