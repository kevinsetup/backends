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
import pe.edu.com.sysrubricas.entity.Curso_plan;
import pe.edu.com.sysrubricas.service.Curso_planService;

@RestController
@RequestMapping("/curso_plan")
@CrossOrigin(origins = "http://localhost:4200")
public class Curso_planController {
@Autowired
private Curso_planService curso_planService;
@GetMapping("/lista")
public Map<String, Object> readAll(){
	return curso_planService.readAll();
}
@GetMapping( "/{id}")
public Map<String, Object> read (@PathVariable int id){
	try {
		return curso_planService.read(id);
	} catch (Exception e) {
		System.out.println("eror");
		return null;
	}
}
@GetMapping( "/cpp/{id}")
public Map<String, Object> readcpp (@PathVariable int id){
	try {
		return curso_planService.readcpp(id);
	} catch (Exception e) {
		System.out.println("eror");
		return null;
	}
}
@DeleteMapping("/delete/{id}")
public int delete(@PathVariable int id) {
	return curso_planService.delete(id);
}
@PostMapping("/add")
public int create (@RequestBody Curso_plan cp) {
	return curso_planService.create(cp);
}
@PutMapping( "/update/{id}")
public int edit(@RequestBody Curso_plan cp , @PathVariable  int id) {
	cp.setId_curso_plan(id);;
	return curso_planService.update(cp);
	
}
@GetMapping("/xplan/{id}")
public 	Map<String, Object> readxPlan(@PathVariable int id){
	return curso_planService.readxPlan(id);
}
}
