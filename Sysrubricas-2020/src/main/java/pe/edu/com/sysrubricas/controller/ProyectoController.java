package pe.edu.com.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.service.ProyectoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
@Autowired
private ProyectoService proyectoDao;
@GetMapping( "/proyecto/{id}")
public Map<String, Object> readcpp (@PathVariable int id){
	try {
		return proyectoDao.readxUnidad(id);
	} catch (Exception e) {
		System.out.println("eror");
		return null;
	}
}
}
