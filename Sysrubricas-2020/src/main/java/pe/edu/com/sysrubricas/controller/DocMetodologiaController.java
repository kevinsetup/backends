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

import pe.edu.com.sysrubricas.entity.DocMetodologia;

import pe.edu.com.sysrubricas.service.DocMetodologiaService;

@RestController
@RequestMapping("/api")
public class DocMetodologiaController {

	@Autowired
	private DocMetodologiaService docMetodologiaService;
	@GetMapping("/documentos")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return docMetodologiaService.readAllMetodologia();
	}
	@GetMapping("/documentos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return docMetodologiaService.readAllMetodologia();
	}
	@PostMapping("/documentos/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody DocMetodologia dm) {
		return docMetodologiaService.createDocMetodologia(dm);
	}
	@DeleteMapping("/documentos/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return docMetodologiaService.deleteMetodologia(id);
	}
	
	@PutMapping("/documentos/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody DocMetodologia dm,@PathVariable int id) {
		DocMetodologia documento = new DocMetodologia();
		documento.setId_metodologia(id);
		documento.setId_unidad(dm.getId_unidad());
		documento.setId_semestre(dm.getId_semestre());
		documento.setDocumento(dm.getDocumento());
		return docMetodologiaService.updateDocMetodologia(documento);
	}
	
	
	
	
}
