package pe.edu.com.sysrubricas.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.edu.com.sysrubricas.service.RubricasService;
import pe.edu.com.sysrubricas.entity.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
@RequestMapping(value = "/api/rubrica")
public class RubricasController {
	@Autowired
	private RubricasService rubricaService;
	
	//crear rubrica
    @PostMapping()
    public ResponseEntity<Rubrica> createRubrica(@RequestBody Rubrica rubrica){
    	rubricaService.createRubrica(rubrica);
        return new ResponseEntity<Rubrica>(rubrica, HttpStatus.CREATED);
        
    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id) {
		return rubricaService.deletRubrica(id);
	}
    
    
    //listar rubricas x proyecto
    @GetMapping("{id}")
    public Map<String, List<v_Rubrica>> getRubricas(@PathVariable int id){
        Map<String,List<v_Rubrica>> rubricas = new HashMap<>();
        rubricas.put("rubricas", rubricaService.getRubricas(id));
        return rubricas;
    }
    //para listar la rubrica x id
    @GetMapping("indicador/{id}")
    public Map<String,List<v_Rubrica>> getRubrica(@PathVariable int id){
        Map<String,List<v_Rubrica>> rubrica = new HashMap<>();
        rubrica.put("rubrica", rubricaService.getOnlyRubrica(id));
        return rubrica;
    }
    //crear un indicador
    @PostMapping("indicador")
    public ResponseEntity<Criterio> createIndicador(@RequestBody Criterio criterio){
        rubricaService.createCriterio(criterio);
        return new ResponseEntity<Criterio>(criterio,HttpStatus.CREATED);
    }
    //listar indicadores x rubrica
    @GetMapping("indicadores/{id}")
    public Map<String,List<Criterio>> getIndicadores(@PathVariable int id){
        Map<String,List<Criterio>> indicadores = new HashMap<>();
        indicadores.put("indicadores",rubricaService.getCriterio(id));
        return indicadores;
    }
    @GetMapping("niveles_logro")
    public Map<String,List<NivelLogro>> getNivelesLogro(){
        Map<String,List<NivelLogro>> nivelesLogro = new HashMap<>();
        nivelesLogro.put("niveles_logro", rubricaService.getNivelesLogro());
        return nivelesLogro;
    }
    @GetMapping("niveles_logro/indicador/{id}")
    public Map<String,List<Criterio>> getOnlyIndicador(@PathVariable int id){
        Map<String,List<Criterio>> indicador = new HashMap<>();
        indicador.put("indicador",rubricaService.getOnlyCriterio(id));
        return indicador;
    }
    @GetMapping("nivel_rubrica/{id}")
    public Map<String,List<v_CriterioNivel>> getNivelesRubrica(@PathVariable int id){
        Map<String,List<v_CriterioNivel>> nivelRubrica = new HashMap<>();
        nivelRubrica.put("niveles_rubrica",rubricaService.getNivelRubrica(id));
        return nivelRubrica;
    }
    @PostMapping("nivel_rubrica")
    public ResponseEntity<CriterioNivel> createNivelRubrica(@RequestBody CriterioNivel criterionivel){
        rubricaService.createNivelRubrica(criterionivel);
        return new ResponseEntity<>(criterionivel,HttpStatus.CREATED);

    }
 
 
		
		
}
