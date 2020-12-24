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
import pe.edu.com.sysrubricas.dao.ParticipanteDao;
import pe.edu.com.sysrubricas.entity.Participante;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ParticipanteController {
@Autowired
private ParticipanteDao participanteDao;
@GetMapping("/participante")
public Map<String, Object> readAll(){
	return participanteDao.readAll();
}
@GetMapping( "/participante/{id}")
public Map<String, Object> read (@PathVariable int id){
	try {
		return participanteDao.read(id);
	} catch (Exception e) {
		System.out.println("eror");
		return null;
	}
}
@DeleteMapping("/participante/delete/{id}")
public int delete(@PathVariable int id) {
	return participanteDao.delete(id);
}
@PostMapping("/participante/add")
public int create (@RequestBody Participante c) {
	return participanteDao.create(c);
}
@PutMapping( "/participante/update/{id}")
public int edit(@RequestBody Participante c , @PathVariable  int id) {
	c.setId_participante(id);
	return participanteDao.update(c);
	
}
}
