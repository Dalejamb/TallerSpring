package edu.componentes.TallerMolina.controlador;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.componentes.TallerMolina.modelo.Usuario;
import edu.componentes.TallerMolina.servicio.UsuarioServicio;

@RestController
@RequestMapping("/ejercicio/1")
public class UsuarioControlador {
    
    private final UsuarioServicio servicio;
    
    public UsuarioControlador(UsuarioServicio servicio) {
        this.servicio = servicio;
    }
    
    // POST http://localhost:8080/ejercicio/1/usuarios
    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(servicio.registrar(usuario));
    }
    
    // GET http://localhost:8080/ejercicio/1/usuarios
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(servicio.listar());
    }
    
    // DELETE http://localhost:8080/ejercicio/1/usuarios/{id}
    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable Long id) {
        servicio.eliminar(id);
        return ResponseEntity.ok("Usuario eliminado exitosamente");
    }
}