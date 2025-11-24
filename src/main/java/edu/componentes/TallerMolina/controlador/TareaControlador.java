package edu.componentes.TallerMolina.controlador;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.componentes.TallerMolina.modelo.Tarea;
import edu.componentes.TallerMolina.servicio.TareaServicio;

@RestController
@RequestMapping("/ejercicio/5")
public class TareaControlador {
    
    private final TareaServicio servicio;
    
    public TareaControlador(TareaServicio servicio) {
        this.servicio = servicio;
    }
    
    // POST http://localhost:8080/ejercicio/5/tareas
    @PostMapping("/tareas")
    public ResponseEntity<Tarea> crearTarea(@RequestBody Tarea tarea) {
        return ResponseEntity.ok(servicio.crear(tarea));
    }
    
    // GET http://localhost:8080/ejercicio/5/tareas
    @GetMapping("/tareas")
    public ResponseEntity<List<Tarea>> listarTareas() {
        return ResponseEntity.ok(servicio.listar());
    }
    
    // GET http://localhost:8080/ejercicio/5/tareas/{id}
    @GetMapping("/tareas/{id}")
    public ResponseEntity<Tarea> obtenerTarea(@PathVariable Long id) {
        Tarea tarea = servicio.obtenerPorId(id);
        if (tarea != null) {
            return ResponseEntity.ok(tarea);
        }
        return ResponseEntity.notFound().build();
    }
    
    // PUT http://localhost:8080/ejercicio/5/tareas/{id}
    @PutMapping("/tareas/{id}")
    public ResponseEntity<Tarea> actualizarTarea(
            @PathVariable Long id, @RequestBody Tarea tarea) {
        Tarea tareaActualizada = servicio.actualizar(id, tarea);
        if (tareaActualizada != null) {
            return ResponseEntity.ok(tareaActualizada);
        }
        return ResponseEntity.notFound().build();
    }
    
    // DELETE http://localhost:8080/ejercicio/5/tareas/{id}
    @DeleteMapping("/tareas/{id}")
    public ResponseEntity<String> eliminarTarea(@PathVariable Long id) {
        servicio.eliminar(id);
        return ResponseEntity.ok("Tarea eliminada exitosamente");
    }
    
    // PATCH http://localhost:8080/ejercicio/5/tareas/{id}/completar
    @PatchMapping("/tareas/{id}/completar")
    public ResponseEntity<Tarea> completarTarea(@PathVariable Long id) {
        Tarea tarea = servicio.completar(id);
        if (tarea != null) {
            return ResponseEntity.ok(tarea);
        }
        return ResponseEntity.notFound().build();
    }
}