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

import pe.edu.com.sysrubricas.entity.Competencia;
import pe.edu.com.sysrubricas.entity.Semestre;
import pe.edu.com.sysrubricas.service.CompetenciaService;


@RestController
@RequestMapping("/competencias")
public class CompetenciaController {
	@Autowired
	private CompetenciaService compser;
	
	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return compser.readAll();
	}
	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return compser.read(id);
	}
	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Competencia comp) {
		Competencia competencia = new Competencia();
		competencia.setNombre(comp.getNombre());
		competencia.setIdplan_l(comp.getIdplan_l());
		competencia.setDescripcion(comp.getDescripcion());
		competencia.setTipo(comp.getTipo());
		return compser.create(competencia);
	}
	
	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return compser.delete(id);
	}
	@PutMapping("/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Competencia competencia,@PathVariable int id) {
		competencia.setIdcomp(id);
		return compser.update(competencia);
	}
	
	@GetMapping("/allxplanl/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readxPlan_l(@PathVariable int id){
		return compser.readxPlan_l(id);
	}
	
}
