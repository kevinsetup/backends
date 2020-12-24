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

import pe.edu.com.sysrubricas.entity.Modulo;
import pe.edu.com.sysrubricas.entity.Rol;
import pe.edu.com.sysrubricas.service.ModuloService;
import pe.edu.com.sysrubricas.service.RolService;
@RestController
@RequestMapping("/api")
public class ModuloController {
	@Autowired
	private ModuloService moduloservice;

	@GetMapping("/modulos")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
	    return moduloservice.readAll();
	}
	
	@GetMapping("/modulos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id ) {
	    try {
	         return moduloservice.read(id);
	    } catch (Exception e) {
	        System.out.println("error");
	        return null;
	    }
	}
	@DeleteMapping("/modulos/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id ) {
	    return moduloservice.delete(id);
	}
	//PostMapping permite registrar un nuevo producto
	@PostMapping("/modulos/add")
	@CrossOrigin(origins = "http://localhost:4200") 	
	public int create(@RequestBody Modulo m) {
	    System.out.println("Crear: "+m.getNombremod());
	    return moduloservice.create(m);
	}
	@PutMapping("modulos/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Modulo modulo, @PathVariable int id) {
		Modulo m = new Modulo();
		m.setIdmodulo(id);
		m.setNombremod(modulo.getNombremod());
		return moduloservice.update(m);
	}
}
