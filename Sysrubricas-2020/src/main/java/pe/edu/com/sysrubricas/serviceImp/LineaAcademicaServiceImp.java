package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.service.LineaAcademicaService;
@Service
public class LineaAcademicaServiceImp implements LineaAcademicaService {
	@Autowired
	private LineaAcademicaDao ldao;
	@Override
	public int create(LineaAcademica l) {
		return ldao.create(l);
	}

	@Override
	public int update(LineaAcademica l) {
		return ldao.update(l);
	}

	@Override
	public int delete(int id) {
		return ldao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return ldao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return ldao.readAll();
	}

}
