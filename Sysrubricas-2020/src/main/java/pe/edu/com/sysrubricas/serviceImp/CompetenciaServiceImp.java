package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.CompetenciaDao;

import pe.edu.com.sysrubricas.entity.Competencia;

import pe.edu.com.sysrubricas.service.CompetenciaService;

@Service
public class CompetenciaServiceImp implements CompetenciaService {
	@Autowired
	private CompetenciaDao compdao;
	@Override
	public int create(Competencia comp) {
		return compdao.create(comp);
	}

	@Override
	public int update(Competencia comp) {
		return compdao.update(comp);
	}

	@Override
	public int delete(int id) {
		return compdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return compdao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return compdao.readAll();
	}
	@Override
	public Map<String, Object> readxPlan_l(int id){
		return compdao.readxPlan_l(id);		
	}
}
