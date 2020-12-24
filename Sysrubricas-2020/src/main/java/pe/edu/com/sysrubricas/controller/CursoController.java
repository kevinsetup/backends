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

import pe.edu.com.sysrubricas.entity.Curso;
import pe.edu.com.sysrubricas.service.CursoService;
@RestController
@RequestMapping("/curso")
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {
	@Autowired
	private CursoService cursoservice;
	@GetMapping("/lista")
	public Map<String, Object> readAll(){
		return cursoservice.readAll();
	}
	@GetMapping( "/{id}")
	public Map<String, Object> read (@PathVariable int id){
		try {
			return cursoservice.read(id);
		} catch (Exception e) {
			System.out.println("eror");
			return null;
		}
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return cursoservice.delete(id);
	}
	@PostMapping("/add")
	public int create (@RequestBody Curso c) {
		return cursoservice.create(c);
	}
	@PutMapping( "/update/{id}")
	public int edit(@RequestBody Curso c , @PathVariable  int id) {
		c.setIdcurso(id);
		return cursoservice.update(c);
		
	}
}
