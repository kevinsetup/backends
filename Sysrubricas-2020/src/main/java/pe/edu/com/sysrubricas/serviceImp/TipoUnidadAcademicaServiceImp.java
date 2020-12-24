package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.dao.TipoUnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
import pe.edu.com.sysrubricas.service.TipoUnidadAcademicaService;
@Service
public class TipoUnidadAcademicaServiceImp implements TipoUnidadAcademicaService {
	@Autowired
	private TipoUnidadAcademicaDao tdao;

	@Override
	public int create(TipoUnidadAcademica t) {
		// TODO Auto-generated method stub
		return tdao.create(t);
	}

	@Override
	public int update(TipoUnidadAcademica t) {
		// TODO Auto-generated method stub
		return tdao.update(t);
	}

	@Override
	public Map<String, Object> delete(int id) {
		// TODO Auto-generated method stub
		return tdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tdao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tdao.readAll();
	}

	@Override
	public TipoUnidadAcademica readUpdate(int id) {
		// TODO Auto-generated method stub
		return tdao.readUpdate(id);
	}

}
