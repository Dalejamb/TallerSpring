package edu.componentes.TallerMolina.servicio;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

	public HashMap<String, String> saludar(String dato){
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("saludo", "Hola Estimado/a "+ dato + ", que tengas un buen día");
		return map;
	}
}