package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.Curso_planDao;
import pe.edu.com.sysrubricas.entity.Curso_plan;
import pe.edu.com.sysrubricas.service.Curso_planService;
@Service
public class Curso_planServiceImp implements Curso_planService {
@Autowired
private Curso_planDao curso_planDao;
	@Override
	public int create(Curso_plan cp) {
		// TODO Auto-generated method stub
		return curso_planDao.create(cp);
	}

	@Override
	public int update(Curso_plan cp) {
		// TODO Auto-generated method stub
		return curso_planDao.update(cp);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return curso_planDao.delete(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return curso_planDao.readAll();
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return curso_planDao.read(id);
	}
	@Override
	public Map<String, Object> readcpp(int id) {
		// TODO Auto-generated method stub
		return curso_planDao.readcpp(id);
	}
	@Override
	public 	Map<String, Object> readxPlan(int id){
		return curso_planDao.readxPlan(id);
	}
}
