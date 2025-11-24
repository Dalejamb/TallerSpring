package edu.componentes.TallerMolina.servicio;

import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class TemperaturaServicio {

    public HashMap<String, String> convertir(double celsius) {

        double fahrenheit = (celsius * 9 / 5) + 32;

        HashMap<String, String> respuesta = new HashMap<>();
        respuesta.put("celsius", String.format("%.2f", celsius));
        respuesta.put("fahrenheit", String.format("%.2f", fahrenheit));

        return respuesta;
    }
}