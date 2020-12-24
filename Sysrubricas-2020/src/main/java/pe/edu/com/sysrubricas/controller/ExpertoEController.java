package pe.edu.com.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.service.ExpertoEService;
@RestController
@RequestMapping("/expertoe")
public class ExpertoEController {
			@Autowired
			private ExpertoEService e;
			
			@GetMapping("/lista")
			@CrossOrigin(origins = "http://localhost:4200")
			public Map<String, Object> readAll(){
				return e.readAll();
			}

}
