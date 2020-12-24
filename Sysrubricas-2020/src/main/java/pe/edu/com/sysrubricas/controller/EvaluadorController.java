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

import pe.edu.com.sysrubricas.entity.Evaluador;
import pe.edu.com.sysrubricas.service.EvaluadorService;

@RestController
@RequestMapping("/api")
public class EvaluadorController {
	@Autowired
	private EvaluadorService evaluadorService;
	
	@GetMapping("/evaluadores")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return evaluadorService.readAllEvaluador();
	}
	@GetMapping("/evaluadores/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return evaluadorService.readEvaluador(id);
	}
	@PostMapping("/evaluadores/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Evaluador ev) {
		return evaluadorService.createEvaluador(ev);
	}
	@DeleteMapping("/evaluadores/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return evaluadorService.deleteEvaluador(id);
	}
	
	@PutMapping("/evaluadores/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Evaluador ev,@PathVariable int id) {
		Evaluador evaluador = new Evaluador();
		evaluador.setIdevaluador(id);
		evaluador.setId_persona(ev.getId_persona());
		evaluador.setId_proyecto(ev.getId_proyecto());
		evaluador.setTipo(ev.getTipo());
		return evaluadorService.updateEvaluador(evaluador);
	}
}
