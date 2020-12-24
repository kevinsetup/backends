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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
import pe.edu.com.sysrubricas.entity.UnidadAcademica;
import pe.edu.com.sysrubricas.service.TipoUnidadAcademicaService;
import pe.edu.com.sysrubricas.service.UnidadAcademicaService;
@RestController
@RequestMapping("/api")


public class UnidadAcademicaController {

	@Autowired
	private UnidadAcademicaService us;
	@GetMapping("/unidad")
	@CrossOrigin(origins = "http://localhost:4200")

	public Map<String, Object> readAll(){
		return us.readAll();
	}
	@GetMapping("/unidad/campus")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> Campus(){
		return us.Campus();
	}
	@GetMapping("/unidad/campus/{nom}")

	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readCampus(@PathVariable String nom){
		return us.readCampus(nom);
	}
	
	@PostMapping("/unidad")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody UnidadAcademica u) {
		UnidadAcademica h = new UnidadAcademica();
		h.setNombre(u.getNombre());
		h.setId_padre(u.getId_padre());
		h.setId_tipo(u.getId_tipo());
		return us.create(h);
	}
	@PutMapping("/unidad/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody UnidadAcademica u, @PathVariable int id) {
		
	   UnidadAcademica uss = new UnidadAcademica();
	   uss.setId_unidad(id);
	   uss.setNombre(u.getNombre());
	   uss.setId_padre(u.getId_padre());
	   return us.update(uss);
		
	}
	@DeleteMapping("/unidad/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> delete(@PathVariable int id) {
		return us.delete(id);
	}
	
	@GetMapping("/unidad/escuela/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> traerEscuela(@PathVariable int id){
		return us.traerEscuela(id);
	}

}
