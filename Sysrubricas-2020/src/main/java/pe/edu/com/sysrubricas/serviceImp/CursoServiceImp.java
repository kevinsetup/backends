package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.CursoDao;
import pe.edu.com.sysrubricas.entity.Curso;
import pe.edu.com.sysrubricas.service.CursoService;
@Service
public class CursoServiceImp implements CursoService {
	@Autowired
	private CursoDao cursoDao;
	@Override
	public int create(Curso c) {
		// TODO Auto-generated method stub
		return cursoDao.create(c);
	}

	@Override
	public int update(Curso c) {
		// TODO Auto-generated method stub
		return cursoDao.update(c);
	}

	@Override
	public int delete(int c) {
		// TODO Auto-generated method stub
		return cursoDao.delete(c);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return cursoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return cursoDao.readAll();
	}

}
