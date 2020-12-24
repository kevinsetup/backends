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

import pe.edu.com.sysrubricas.entity.PlanLinea;
import pe.edu.com.sysrubricas.service.PlanLineaService;

@RestController
@RequestMapping("/api")
public class PlanLineaController {
	@Autowired
	private PlanLineaService plser;
	
	@GetMapping("/planlineas")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAllDin(){
		return plser.readAllDin();
	}
	
	@GetMapping("/planlineas/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id){
		return plser.read(id);
	}
	
	@PostMapping("/planlineas/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody PlanLinea pl) {
		return plser.create(pl);
	}
	
	@DeleteMapping("/planlineas/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return plser.delete(id);
	}
	
	@PutMapping("/planlineas/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody PlanLinea planl, @PathVariable int id) {
		PlanLinea pl  = new PlanLinea();
		pl.setIdplan_l(id);
		pl.setIdplan(planl.getIdplan());
		pl.setIdlinea(planl.getIdlinea());
		return plser.update(pl);
	}
	@GetMapping("/planlineas/lineas/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> lineasxPlan(@PathVariable int id){
		return plser.lineasxPlan(id);
	}
}
