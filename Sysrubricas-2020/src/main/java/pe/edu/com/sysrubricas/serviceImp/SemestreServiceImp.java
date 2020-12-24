package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.SemestreDao;

import pe.edu.com.sysrubricas.entity.Semestre;
import pe.edu.com.sysrubricas.service.SemestreService;
@Service
public class SemestreServiceImp implements SemestreService {
	@Autowired
	private SemestreDao sdao;
	@Override
	public int create(Semestre s) {
		return sdao.create(s);
	}

	@Override
	public int update(Semestre s) {
		return sdao.update(s);
	}

	@Override
	public int delete(int id) {
		return sdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return sdao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return sdao.readAll();
	}

}
