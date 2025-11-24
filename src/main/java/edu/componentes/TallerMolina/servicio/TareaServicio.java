package edu.componentes.TallerMolina.servicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import edu.componentes.TallerMolina.modelo.Tarea;

@Service
public class TareaServicio {
    
    private List<Tarea> tareas = new ArrayList<>();
    private Long contadorId = 1L;
    
    public Tarea crear(Tarea tarea) {
        tarea.setId(contadorId++);
        if (tarea.getEstado() == null || tarea.getEstado().isEmpty()) {
            tarea.setEstado("pendiente");
        }
        tareas.add(tarea);
        return tarea;
    }
    
    public List<Tarea> listar() {
        return tareas;
    }
    
    public Tarea obtenerPorId(Long id) {
        return tareas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    public Tarea actualizar(Long id, Tarea tareaActualizada) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getId().equals(id)) {
                tareaActualizada.setId(id);
                tareas.set(i, tareaActualizada);
                return tareaActualizada;
            }
        }
        return null;
    }
    
    public void eliminar(Long id) {
        tareas.removeIf(t -> t.getId().equals(id));
    }
    
    public Tarea completar(Long id) {
        Tarea tarea = obtenerPorId(id);
        if (tarea != null) {
            tarea.setEstado("completada");
        }
        return tarea;
    }
}