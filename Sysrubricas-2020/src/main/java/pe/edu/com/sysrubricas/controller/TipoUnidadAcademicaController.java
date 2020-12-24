package pe.edu.com.sysrubricas.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
import pe.edu.com.sysrubricas.service.TipoUnidadAcademicaService;
@RestController
@RequestMapping("/api")
public class TipoUnidadAcademicaController {
	@Autowired
	private TipoUnidadAcademicaService tser;
	
	@GetMapping("/tipo")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return tser.readAll();
	}
	@PostMapping("/tipo")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody TipoUnidadAcademica t) {
		TipoUnidadAcademica h = new TipoUnidadAcademica();
		h.setNombre(t.getNombre());
		return tser.create(h);
	}
	
	@GetMapping("/tipo/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return tser.read(id);
	}
	
	
	
	@PutMapping("/tipo/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody TipoUnidadAcademica t, @PathVariable int id) {
		
	   TipoUnidadAcademica us = new TipoUnidadAcademica();
	    us.setId_tipoUnidad(id);
		us.setNombre(t.getNombre());
		return tser.update(us);
	
		
		
	}
	@DeleteMapping("/tipo/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> delete(@PathVariable int id) {
		return tser.delete(id);
	}
	
	

	
}
