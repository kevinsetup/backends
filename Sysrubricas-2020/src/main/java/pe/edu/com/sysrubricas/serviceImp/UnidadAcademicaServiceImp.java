package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
import pe.edu.com.sysrubricas.entity.UnidadAcademica;
import pe.edu.com.sysrubricas.service.TipoUnidadAcademicaService;
import pe.edu.com.sysrubricas.service.UnidadAcademicaService;
@Service
public class UnidadAcademicaServiceImp implements UnidadAcademicaService {
	@Autowired
	private UnidadAcademicaDao uni;

	@Override
	public int create(UnidadAcademica u) {
		// TODO Auto-generated method stub
		return uni.create(u);
	}

	@Override
	public int update(UnidadAcademica u) {
		// TODO Auto-generated method stub
		return uni.update(u);
	}

	@Override
	public UnidadAcademica readUpdate(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> delete(int id) {
		// TODO Auto-generated method stub
		return uni.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return uni.readAll();
	}

	@Override
	public Map<String, Object> Campus() {
		// TODO Auto-generated method stub
		return uni.Campus();
	}

	@Override
	public Map<String, Object> readCampus(String nom) {
		// TODO Auto-generated method stub
		return uni.readCampus(nom);
	}
	@Override
	public Map<String, Object> traerEscuela(int id){
		return uni.traerEscuela(id);
	}

}
