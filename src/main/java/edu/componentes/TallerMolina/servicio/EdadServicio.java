package edu.componentes.TallerMolina.servicio;

import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class EdadServicio {

    public HashMap<String, String> validarEdad(String nombre, int edad) {

        HashMap<String, String> respuesta = new HashMap<>();

        String mensaje;
        if (edad >= 18) {
            mensaje = nombre + " es mayor de edad.";
        } else {
            mensaje = nombre + " es menor de edad.";
        }

        respuesta.put("nombre", nombre);
        respuesta.put("edad", String.valueOf(edad));
        respuesta.put("resultado", mensaje);

        return respuesta;
    }
}
