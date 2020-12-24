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

import pe.edu.com.sysrubricas.entity.PlanAcademico;
import pe.edu.com.sysrubricas.service.PlanAcademicoService;

@RestController
@RequestMapping("/api")
public class PlanAcademicoController {
	@Autowired
	private PlanAcademicoService pser;
	
	@GetMapping("/planes")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return pser.readAll();
	}
	
	@GetMapping("/planes/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id){
		return pser.read(id);
	}
	
	@PostMapping("/planes/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody PlanAcademico p) {
		return pser.create(p);
	}
	
	@DeleteMapping("/planes/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return pser.delete(id);
	}
	
	@PutMapping("/planes/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody PlanAcademico plan, @PathVariable int id) {
		PlanAcademico p = new PlanAcademico();
		p.setIdplan(id);
		p.setNombre(plan.getNombre());
		p.setIdunidad(plan.getIdunidad());
		p.setCiclos(plan.getCiclos());
		p.setCursos(plan.getCursos());
		p.setCreditos(plan.getCreditos());
		p.setAnio_inicio(plan.getAnio_inicio());
		p.setAnio_termino(plan.getAnio_termino());
		return pser.update(p);
	}
	@GetMapping("/planes/xunidad/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readxUnidad(@PathVariable int id){
		return pser.readxUnidad(id);
	}
	@GetMapping("/planes/xunidad/selector/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readPlanforSelector(@PathVariable int id){
		return pser.readPlanforSelector(id);
	}
}
