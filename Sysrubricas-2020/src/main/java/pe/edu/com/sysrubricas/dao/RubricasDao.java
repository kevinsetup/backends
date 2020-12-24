package pe.edu.com.sysrubricas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.com.sysrubricas.entity.*;



public interface RubricasDao {
	
	    int createRubrica(Rubrica rubrica);
	    int deletRubrica(int id);
	    int createCriterio(Criterio indicador);
	    int createNivelRubrica(CriterioNivel nivelRubrica);
	    
	    
	    
	    List<v_Rubrica> getRubricas(int id);
	    List<v_Rubrica> getOnlyRubrica(int id);
	    List<Criterio> getCriterio(int id);
	    List<Criterio> getOnlyCriterio(int id);
	    List<NivelLogro> getNivelesLogro();
	    List<v_CriterioNivel> getNivelRubrica(int id);
	  
	
}
