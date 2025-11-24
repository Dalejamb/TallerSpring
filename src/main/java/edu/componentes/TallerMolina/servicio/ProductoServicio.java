package edu.componentes.TallerMolina.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.componentes.TallerMolina.modelo.Producto;

@Service
public class ProductoServicio {

    private final List<Producto> productos = new ArrayList<>();

    public Producto agregarProducto(Producto p) {
        productos.add(p);
        return p;
    }

    public List<Producto> listarProductos() {
        return productos;
    }

    public List<Producto> buscarPorCategoria(String categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }
}
