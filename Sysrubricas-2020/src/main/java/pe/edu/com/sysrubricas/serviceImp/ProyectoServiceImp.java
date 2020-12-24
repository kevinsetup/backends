package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.ProyectoDao;
import pe.edu.com.sysrubricas.entity.Proyecto;
import pe.edu.com.sysrubricas.service.ProyectoService;
@Service
public class ProyectoServiceImp implements ProyectoService {
		@Autowired
		private ProyectoDao proyectoDao;
	@Override
	public int create(Proyecto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Proyecto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readxUnidad(int id) {
		// TODO Auto-generated method stub
		return proyectoDao.readxUnidad(id);
	}

}
