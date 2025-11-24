package edu.componentes.TallerMolina.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.componentes.TallerMolina.modelo.Libro;

@Service
public class LibroServicio {

    private List<Libro> libros = new ArrayList<>();

    public LibroServicio() {}

    public Libro agregarLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

    public List<Libro> buscarPorAutor(String autor) {
        return libros.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .toList();
    }
}
