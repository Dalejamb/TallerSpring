package edu.componentes.TallerMolina.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.componentes.TallerMolina.servicio.MensajeMotivacionalServicio;

@RestController
@RequestMapping("/ejercicio/10")
public class MensajeMotivacionalControlador {

    private final MensajeMotivacionalServicio servicio;

    public MensajeMotivacionalControlador(MensajeMotivacionalServicio servicio) {
        this.servicio = servicio;
    }

    // GET  http://localhost:8080/ejercicio/10/mensaje
    @GetMapping("/mensaje")
    public ResponseEntity<String> obtenerMensaje() {
        return ResponseEntity.ok(servicio.obtenerMensajeAleatorio());
    }
}