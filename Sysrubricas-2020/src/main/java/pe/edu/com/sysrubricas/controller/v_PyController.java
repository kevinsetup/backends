package pe.edu.com.sysrubricas.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.entity.v_Curso;
import pe.edu.com.sysrubricas.entity.v_Proyecto;
import pe.edu.com.sysrubricas.service.v_PyService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/api/proyectos")
public class v_PyController {

	@Autowired
    private v_PyService proyectoService;




    @GetMapping("/{id}")
    public Map<String, List<v_Proyecto>> getProyectos(@PathVariable int id){
        Map<String,List<v_Proyecto>> proyectos = new HashMap<>();
        proyectos.put("proyectos",proyectoService.getProyecto(id));
        return proyectos;
    }

    @GetMapping("union/{id}")
    public ArrayList getUnion(@PathVariable int id){
        Map<String,List<v_Proyecto>> proyecto = new HashMap<>();
        Map<String,List<v_Curso>> cursos = new HashMap<>();
        proyecto.put("proyecto",proyectoService.comoBuscar(id));
        cursos.put("cursos",proyectoService.getCursosxPy(id));
        ArrayList loba = new ArrayList();
        loba.add(proyecto);
        loba.add(cursos);


        return  loba;
    }


    @GetMapping("/curso/{id}")
    public Map<String,List<v_Curso>> getCursos(@PathVariable int id){
        Map<String,List<v_Curso>> cursos = new HashMap<>();
        cursos.put("cursos",proyectoService.getCursosxPy(id));
        return cursos;
    }
	
	
	
}
