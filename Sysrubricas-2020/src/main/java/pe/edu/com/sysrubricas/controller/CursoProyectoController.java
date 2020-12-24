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

import pe.edu.com.sysrubricas.entity.CursoProyecto;
import pe.edu.com.sysrubricas.service.CursoProyectoService;

@RestController
@RequestMapping("/api")
public class CursoProyectoController {
	@Autowired
	private CursoProyectoService cursosproyService;
	@GetMapping("/cursosproy")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return cursosproyService.readAllCursoProyecto();
	}
	@GetMapping("/cursosproy/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return cursosproyService.readCursoProyecto(id);
	}
	@PostMapping("/cursosproy/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody CursoProyecto cp) {
		return cursosproyService.createCursoProyecto(cp);
	}
	@DeleteMapping("/cursosproy/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return cursosproyService.deleteCursoProyecto(id);
	}
	
	@PutMapping("/cursosproy/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody CursoProyecto cp,@PathVariable int id) {
		CursoProyecto cursosproy = new CursoProyecto();
		cursosproy.setId_curso_proy(id);
		cursosproy.setId_proyecto(cp.getId_proyecto());
		cursosproy.setId_carga(cp.getId_carga());
		
		return cursosproyService.updateCursoProyecto(cursosproy);
	}
}
