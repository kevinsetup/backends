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

import pe.edu.com.sysrubricas.entity.Hitos;
import pe.edu.com.sysrubricas.service.HitosService;

@RestController
@RequestMapping("/api")
public class HitosController {
	@Autowired
	private HitosService hitosService;
	@GetMapping("/hitos")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return hitosService.readAllHitos();
	}
	@GetMapping("/hitos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return hitosService.readHitos(id);
	}
	@PostMapping("/hitos/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Hitos h) {
		return hitosService.createHitos(h);
	}
	@DeleteMapping("/hitos/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return hitosService.deleteHitos(id);
	}
	
	@PutMapping("/hitos/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Hitos h,@PathVariable int id) {
		Hitos hitos = new Hitos();
		hitos.setId_hito(id);
		hitos.setFecha(h.getFecha());
		hitos.setDocumento(h.getDocumento());
		hitos.setId_curso_proy(h.getId_curso_proy());
		return hitosService.updateHitos(hitos);
	}
}
