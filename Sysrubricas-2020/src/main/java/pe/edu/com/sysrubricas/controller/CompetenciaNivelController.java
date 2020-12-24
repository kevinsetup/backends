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

import pe.edu.com.sysrubricas.entity.CompetenciaNivel;
import pe.edu.com.sysrubricas.service.CompetenciaNivelService;

@RestController
@RequestMapping("/api")
public class CompetenciaNivelController {
	@Autowired
	private CompetenciaNivelService cs;
	
	@GetMapping("/cmpniveles")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return cs.readAll();
	}
	
	@GetMapping("/cmpniveles/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id){
		return cs.read(id);
	}
	@PostMapping("/cmpniveles/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody CompetenciaNivel cn) {
		return cs.create(cn);
	}
	@DeleteMapping("/cmpniveles/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return cs.delete(id);
	}
	@PutMapping("/cmpniveles/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody CompetenciaNivel compn, @PathVariable int id) {
		CompetenciaNivel c = new CompetenciaNivel();
		c.setIdcomp_n(id);
		c.setIdcomp(compn.getIdcomp());
		c.setIdnivel(compn.getIdnivel());
		c.setSaber(compn.getSaber());
		c.setHacer(compn.getHacer());
		return cs.update(c);
	}
	@GetMapping("/cmpniveles/only/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAllDin(@PathVariable int id){
		return cs.readAllDin(id);
	}
	
	@GetMapping("/cmpniveles/selector/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> selector(@PathVariable int id){
		return cs.selector(id);
	}
}

