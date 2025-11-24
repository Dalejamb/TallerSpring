package edu.componentes.TallerMolina.servicio;

import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class MonedaServicio {

    private static final double TASA_DOLAR_A_PESO = 3760.78;

    public HashMap<String, String> convertir(double dolares) {
        HashMap<String, String> respuesta = new HashMap<>();
        double pesos = dolares * TASA_DOLAR_A_PESO;

        respuesta.put("dolares", String.format("%.2f", dolares));
        respuesta.put("tasa", String.format("%.2f", TASA_DOLAR_A_PESO));
        respuesta.put("pesos", String.format("%.2f", pesos));
        return respuesta;
    }
}