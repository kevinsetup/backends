package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.CompetenciaCursoDao;
import pe.edu.com.sysrubricas.entity.CompetenciaCurso;
import pe.edu.com.sysrubricas.service.CompetenciaCursoService;

@Service
public class CompetenciaCursoServiceImp implements CompetenciaCursoService {
	@Autowired
	private CompetenciaCursoDao cdao;
	@Override
	public int create(CompetenciaCurso cc) {
		return cdao.create(cc);
	}

	@Override
	public int update(CompetenciaCurso cc) {
		return cdao.update(cc);
	}

	@Override
	public int delete(int id) {
		return cdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return cdao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return cdao.readAll();
	}

	@Override
	public Map<String, Object> readDinamic(int id) {
		return cdao.readDinamic(id);
	}

}
