package edu.componentes.TallerMolina.controlador;

import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.componentes.TallerMolina.servicio.CalculadoraServicio;

@RestController
@RequestMapping("/ejercicio/3")
public class CalculadoraControlador {

    private final CalculadoraServicio servicio;

    public CalculadoraControlador(CalculadoraServicio servicio) {
        this.servicio = servicio;
    }

    // GET  http://localhost:8080/ejercicio/3/operar/10/5/suma
    @GetMapping("/operar/{n1}/{n2}/{operacion}")
    public ResponseEntity<HashMap<String, String>> operar(
        @PathVariable double n1,
        @PathVariable double n2,
        @PathVariable String operacion) {

        return ResponseEntity.ok(servicio.operar(n1, n2, operacion));
    }
}