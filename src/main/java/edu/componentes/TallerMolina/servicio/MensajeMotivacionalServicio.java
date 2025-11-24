package edu.componentes.TallerMolina.servicio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class MensajeMotivacionalServicio {

    private final List<String> mensajes = Arrays.asList(
        "Cree en ti, estás más cerca de lo que imaginas.",
        "Cada día es una nueva oportunidad para mejorar.",
        "No te rindas, lo mejor está por venir.",
        "Da siempre lo mejor de ti, el esfuerzo nunca falla.",
        "Tu único límite eres tú.",
        "La disciplina te lleva donde la motivación no alcanza.",
        "Hoy puede ser un gran día si tú decides que así sea."
    );

    public String obtenerMensajeAleatorio() {
        Random random = new Random();
        return mensajes.get(random.nextInt(mensajes.size()));
    }
}