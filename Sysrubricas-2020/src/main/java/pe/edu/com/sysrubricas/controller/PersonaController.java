package pe.edu.com.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.entity.Persona;
import pe.edu.com.sysrubricas.service.PersonaService;
@RestController
@RequestMapping("/api")
public class PersonaController {
	@Autowired
	private PersonaService personaService;

	@GetMapping("/personas")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
	    return personaService.readAll();
	}
	@GetMapping("/personas/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id ) {
	    try {
	         return (Map<String, Object>) personaService.read(id);
	    } catch (Exception e) {
	        // TODO: handle exception
	        System.out.println("error");
	        return null;
	    }
	}
	@DeleteMapping("/personas/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id ) {
	    return personaService.delete(id);
	}
	//PostMapping permite registrar un nuevo producto
	@PostMapping("/personas/add")
	@CrossOrigin(origins = "http://localhost:4200") 	
	public int create(@RequestBody Persona p) {
		System.out.println("Crear : "+p.getNombres());
	    return personaService.create(p);
	}
	@PutMapping("/personas/update/{id}")
		@CrossOrigin(origins = "http://localhost:4200")
		public int update(@RequestBody Persona persona, @PathVariable int id) {
			Persona p = new Persona();
			p.setId_persona(id);
			p.setNombres(persona.getNombres());
			p.setApepat(persona.getApepat());
			p.setApemat(persona.getApemat());
			p.setDni(persona.getDni());
			p.setTelefono(persona.getTelefono());
			return personaService.update(p);
	}
}
