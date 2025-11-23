package edu.componentes.TallerMolina.controlador;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.componentes.TallerMolina.servicio.SaludoService;

@RestController
@RequestMapping("/ejercicio/6")

public class SaludoController {
	
	//@Autowired --> forma antigua
	private final SaludoService servicio;
	
	
	
	public SaludoController(SaludoService servicio) {
		this.servicio = servicio;
	}

	//ENDPOINT ---> http://localhost:8080/facil_rodriguez/ejercicio/6s/saludar
	@GetMapping("/saludar/{nombre}")
	public ResponseEntity<HashMap<String, String>> saludar(@PathVariable String nombre){
		
		return ResponseEntity.ok(servicio.saludar(nombre));
	}

}
