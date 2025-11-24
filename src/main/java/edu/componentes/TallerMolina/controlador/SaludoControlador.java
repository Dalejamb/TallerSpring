package edu.componentes.TallerMolina.controlador;

import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.componentes.TallerMolina.servicio.SaludoServicio;

@RestController
@RequestMapping("/ejercicio/6")
public class SaludoControlador {
    
    private final SaludoServicio servicio;
    
    public SaludoControlador(SaludoServicio servicio) {
        this.servicio = servicio;
    }
    
    // GET http://localhost:8080/ejercicio/6/saludar/{nombre}
    @GetMapping("/saludar/{nombre}")
    public ResponseEntity<HashMap<String, String>> saludar(@PathVariable String nombre){
		return ResponseEntity.ok(servicio.saludar(nombre));
	}
}