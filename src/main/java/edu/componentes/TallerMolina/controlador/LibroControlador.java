package edu.componentes.TallerMolina.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.componentes.TallerMolina.modelo.Libro;
import edu.componentes.TallerMolina.servicio.LibroServicio;

@RestController
@RequestMapping("/ejercicio/9")
public class LibroControlador {

    @Autowired
    private LibroServicio servicio;

    // POST  http://localhost:8080/ejercicio/9/agregar
    @PostMapping("/agregar")
    public Libro agregar(@RequestBody Libro libro) {
        return servicio.agregarLibro(libro);
    }

    // GET   http://localhost:8080/ejercicio/9/buscar/{autor}
    @GetMapping("/buscar/{autor}")
    public List<Libro> buscar(@PathVariable String autor) {
        return servicio.buscarPorAutor(autor);
    }
}