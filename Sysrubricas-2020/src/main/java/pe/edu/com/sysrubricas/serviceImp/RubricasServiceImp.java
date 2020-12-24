package pe.edu.com.sysrubricas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.RubricasDao;
import pe.edu.com.sysrubricas.entity.Criterio;
import pe.edu.com.sysrubricas.entity.CriterioNivel;
import pe.edu.com.sysrubricas.entity.NivelLogro;
import pe.edu.com.sysrubricas.entity.Rubrica;
import pe.edu.com.sysrubricas.entity.v_CriterioNivel;
import pe.edu.com.sysrubricas.entity.v_Rubrica;
import pe.edu.com.sysrubricas.service.RubricasService;
@Service
public class RubricasServiceImp implements RubricasService {
	@Autowired
	private RubricasDao ru;

	@Override
	public int createRubrica(Rubrica rubrica) {
		// TODO Auto-generated method stub
		return ru.createRubrica(rubrica);
	}

	@Override
	public int createCriterio(Criterio indicador) {
		// TODO Auto-generated method stub
		return ru.createCriterio(indicador);
	}

	@Override
	public int createNivelRubrica(CriterioNivel nivelRubrica) {
		// TODO Auto-generated method stub
		return ru.createNivelRubrica(nivelRubrica);
	}

	@Override
	public List<v_Rubrica> getRubricas(int id) {
		// TODO Auto-generated method stub
		return ru.getRubricas(id);
	}

	@Override
	public List<v_Rubrica> getOnlyRubrica(int id) {
		// TODO Auto-generated method stub
		return ru.getOnlyRubrica(id);
	}

	@Override
	public List<Criterio> getCriterio(int id) {
		// TODO Auto-generated method stub
		return ru.getCriterio(id);
	}

	@Override
	public List<Criterio> getOnlyCriterio(int id) {
		// TODO Auto-generated method stub
		return ru.getOnlyCriterio(id);
	}

	@Override
	public List<NivelLogro> getNivelesLogro() {
		// TODO Auto-generated method stub
		return ru.getNivelesLogro();
	}

	@Override
	public List<v_CriterioNivel> getNivelRubrica(int id) {
		// TODO Auto-generated method stub
		return ru.getNivelRubrica(id);
	}

	@Override
	public int deletRubrica(int id) {
		// TODO Auto-generated method stub
		return ru.deletRubrica(id);
	}





}
