package edu.componentes.TallerMolina.servicio;

import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServicio {

    public HashMap<String, String> operar(double n1, double n2, String operacion) {

        HashMap<String, String> respuesta = new HashMap<>();
        double resultado;

        switch (operacion.toLowerCase()) {
            case "suma":
                resultado = n1 + n2;
                break;

            case "resta":
                resultado = n1 - n2;
                break;

            case "multiplicacion":
                resultado = n1 * n2;
                break;

            case "division":
                if (n2 == 0) {
                    respuesta.put("error", "No es posible dividir entre 0");
                    return respuesta;
                }
                resultado = n1 / n2;
                break;

            default:
                respuesta.put("error", "Operación no válida. Use: suma, resta, multiplicacion, division.");
                return respuesta;
        }

        respuesta.put("numero1", String.valueOf(n1));
        respuesta.put("numero2", String.valueOf(n2));
        respuesta.put("operacion", operacion);
        respuesta.put("resultado", String.valueOf(resultado));

        return respuesta;
    }
}