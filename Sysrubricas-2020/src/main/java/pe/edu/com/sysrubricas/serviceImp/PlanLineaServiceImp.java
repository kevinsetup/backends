package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.entity.PlanLinea;
import pe.edu.com.sysrubricas.service.PlanLineaService;
@Service
public class PlanLineaServiceImp implements PlanLineaService {
	@Autowired
	private PlanLineaDao pldao;
	@Override
	public int create(PlanLinea pl) {
		return pldao.create(pl);
	}

	@Override
	public int update(PlanLinea pl) {
		return pldao.update(pl);
	}

	@Override
	public int delete(int id) {
		return pldao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return pldao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return pldao.readAll();
	}

	@Override
	public Map<String, Object> readAllDin() {
		return pldao.readAllDin();
	}
	@Override
	public Map<String, Object> lineasxPlan(int id){
		return pldao.lineasxPlan(id);
	}
}
