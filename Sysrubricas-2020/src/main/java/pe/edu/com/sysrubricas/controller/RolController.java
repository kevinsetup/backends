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

import pe.edu.com.sysrubricas.entity.Rol;
import pe.edu.com.sysrubricas.service.RolService;
@RestController
@RequestMapping("/api")
public class RolController {
	@Autowired
	private RolService rolService;

	@GetMapping("/roles")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
	    return rolService.readAll();
	}
	
	@GetMapping("/roles/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id ) {
	    try {
	         return rolService.read(id);
	    } catch (Exception e) {
	        System.out.println("error");
	        return null;
	    }
	}
	@DeleteMapping("/roles/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id ) {
	    return rolService.delete(id);
	}
	//PostMapping permite registrar un nuevo producto
	@PostMapping("/roles/add")
	@CrossOrigin(origins = "http://localhost:4200") 	
	public int create(@RequestBody Rol r) {
	    System.out.println("Crear: "+r.getNombre());
	    return rolService.create(r);
	}
	@PutMapping("roles/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Rol rol, @PathVariable int id) {
		Rol r = new Rol();
		r.setId_rol(id);
		r.setNombre(rol.getNombre());
		return rolService.update(r);
	}
}

