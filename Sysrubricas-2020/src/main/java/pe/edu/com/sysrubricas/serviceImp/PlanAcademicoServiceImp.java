package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.entity.PlanAcademico;
import pe.edu.com.sysrubricas.service.PlanAcademicoService;
@Service
public class PlanAcademicoServiceImp implements PlanAcademicoService {
	@Autowired
	private PlanAcademicoDao pdao;
	@Override
	public int create(PlanAcademico p) {
		return pdao.create(p);
	}

	@Override
	public int update(PlanAcademico p) {
		return pdao.update(p);
	}

	@Override
	public int delete(int id) {
		return pdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return pdao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return pdao.readAll();
	}
	@Override
	public Map<String, Object> readxUnidad(int id){
		return pdao.readxUnidad(id);
	}
	@Override
	public Map<String, Object> readPlanforSelector(int id){
		return pdao.readPlanforSelector(id);
	}

}
