package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.CursoProyectoDao;
import pe.edu.com.sysrubricas.entity.CursoProyecto;
import pe.edu.com.sysrubricas.service.CursoProyectoService;
@Service
public class CursoProyectoServiceImp implements CursoProyectoService {
	@Autowired
	private CursoProyectoDao  cursoProyectoDao;
	@Override
	public int createCursoProyecto(CursoProyecto cp) {
		// TODO Auto-generated method stub
		return cursoProyectoDao.createCursoProyecto(cp);
	}

	@Override
	public int updateCursoProyecto(CursoProyecto cp) {
		// TODO Auto-generated method stub
		return cursoProyectoDao.updateCursoProyecto(cp);
	}

	@Override
	public int deleteCursoProyecto(int id) {
		// TODO Auto-generated method stub
		return cursoProyectoDao.deleteCursoProyecto(id);
	}

	@Override
	public Map<String, Object> readCursoProyecto(int id) {
		// TODO Auto-generated method stub
		return cursoProyectoDao.readCursoProyecto(id);
	}

	@Override
	public Map<String, Object> readAllCursoProyecto() {
		// TODO Auto-generated method stub
		return cursoProyectoDao.readAllCursoProyecto();
	}

}
