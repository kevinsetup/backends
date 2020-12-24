package pe.edu.com.sysrubricas.service;

import java.util.List;
import java.util.Map;

import pe.edu.com.sysrubricas.entity.Criterio;
import pe.edu.com.sysrubricas.entity.CriterioNivel;
import pe.edu.com.sysrubricas.entity.NivelLogro;
import pe.edu.com.sysrubricas.entity.Rubrica;
import pe.edu.com.sysrubricas.entity.v_CriterioNivel;
import pe.edu.com.sysrubricas.entity.v_Rubrica;

public interface RubricasService {
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
