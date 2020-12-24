package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.entity.Docente;
import pe.edu.com.sysrubricas.service.DocenteService;
@Service
public class DocenteServiceImp implements DocenteService {
	@Autowired
	private DocenteDao dc;
	@Override
	public int create(Docente d) {
		return dc.create(d);
	}

	@Override
	public int update(Docente d) {
		return dc.update(d);
	}

	

	@Override
	public Map<String, Object> read(String id) {
		return dc.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return dc.readAll();
	}

	@Override
	public int delete(String codigo) {
		return dc.delete(codigo);
	}
	@Override
	public Map<String, Object> readDinamico(){
		return dc.readDinamico();
	}

}
