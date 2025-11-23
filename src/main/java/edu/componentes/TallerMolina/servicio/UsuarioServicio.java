package edu.componentes.TallerMolina.servicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import edu.componentes.TallerMolina.modelo.Usuario;

@Service
public class UsuarioServicio {
    
    private List<Usuario> usuarios = new ArrayList<>();
    private Long contadorId = 1L;
    
    public Usuario registrar(Usuario usuario) {
        usuario.setId(contadorId++);
        usuarios.add(usuario);
        return usuario;
    }
    
    public List<Usuario> listar() {
        return usuarios;
    }
    
    public void eliminar(Long id) {
        usuarios.removeIf(u -> u.getId().equals(id));
    }
}