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

import pe.edu.com.sysrubricas.entity.CompetenciaCurso;
import pe.edu.com.sysrubricas.service.CompetenciaCursoService;

@RestController
@RequestMapping("/api")
public class CompetenciaCursoController {
	@Autowired
	private CompetenciaCursoService cs;
	
	@GetMapping("/cmpcursos/dinamic/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readDinamic(@PathVariable int id){
		return cs.readDinamic(id);
	}
	
	@GetMapping("/cmpcursos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id){
		return cs.read(id);
	}
	
	@PostMapping("/cmpcursos/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody CompetenciaCurso cc) {
		return cs.create(cc);
	}
	
	@DeleteMapping("/cmpcursos/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return cs.delete(id);
	}
	
	@PutMapping("/cmpcursos/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody CompetenciaCurso compc, @PathVariable int id) {
		CompetenciaCurso c = new CompetenciaCurso();
		c.setIdcomp_c(id);
		c.setId_curso_plan(compc.getId_curso_plan());
		c.setIdcomp_n(compc.getIdcomp_n());
		return cs.update(c);
	}
	
	
}
