package edu.componentes.TallerMolina.controlador;

import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.componentes.TallerMolina.servicio.EdadServicio;

@RestController
@RequestMapping("/ejercicio/8")
public class EdadControlador {

    private final EdadServicio servicio;

    public EdadControlador(EdadServicio servicio) {
        this.servicio = servicio;
    }

    // GET: http://localhost:8080/ejercicio/8/validar?nombre=Sultano&edad=20
    @GetMapping("/validar")
    public ResponseEntity<HashMap<String, String>> validarEdad(
            @RequestParam String nombre,
            @RequestParam int edad) {

        return ResponseEntity.ok(servicio.validarEdad(nombre, edad));
    }
}
