package edu.componentes.TallerMolina.controlador;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.componentes.TallerMolina.modelo.Producto;
import edu.componentes.TallerMolina.servicio.ProductoServicio;

@RestController
@RequestMapping("/ejercicio/4")
public class ProductoControlador {

    private final ProductoServicio servicio;

    public ProductoControlador(ProductoServicio servicio) {
        this.servicio = servicio;
    }

    // POST  http://localhost:8080/ejercicio/4/agregar
    @PostMapping("/agregar")
    public ResponseEntity<Producto> agregar(@RequestBody Producto producto) {
        return ResponseEntity.ok(servicio.agregarProducto(producto));
    }

    // GET   http://localhost:8080/ejercicio/4/listar
    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(servicio.listarProductos());
    }

    // GET   http://localhost:8080/ejercicio/4/categoria/tecnologia
    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<Producto>> buscarPorCategoria(@PathVariable String categoria) {
        return ResponseEntity.ok(servicio.buscarPorCategoria(categoria));
    }
}