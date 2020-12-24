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

import pe.edu.com.sysrubricas.entity.InstrumentoEvaluacion;
import pe.edu.com.sysrubricas.service.InstrumentoEvaluacionService;

@RestController
@RequestMapping("/api")
public class InstrumentoEvaluacionController {
	@Autowired
	private InstrumentoEvaluacionService instrumentoService;
	@GetMapping("/instrumentos")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return instrumentoService.readAllInsturentoEvaluacion();
	}
	@GetMapping("/instrumentos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return instrumentoService.readInsturentoEvaluacion(id);
	}
	@PostMapping("/instrumentos/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody InstrumentoEvaluacion ins) {
		return instrumentoService.createInsturentoEvaluacion(ins);
	}
	@DeleteMapping("/instrumentos/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return instrumentoService.deleteInsturentoEvaluacion(id);
	}
	
	@PutMapping("/instrumentos/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody InstrumentoEvaluacion ins,@PathVariable int id) {
		InstrumentoEvaluacion instrumento = new InstrumentoEvaluacion();
		instrumento.setId_instrumento(id);
		instrumento.setId_metodologia(ins.getId_metodologia());
		instrumento.setNombre(ins.getNombre());
		instrumento.setPorcentaje(ins.getPorcentaje());
		instrumento.setObservacion(ins.getObservacion());
		instrumento.setValidacion(ins.getValidacion());
		return instrumentoService.updateInsturentoEvaluacion(instrumento);
	}
}
