package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.ModuloDao;
import pe.edu.com.sysrubricas.entity.Modulo;
import pe.edu.com.sysrubricas.service.ModuloService;
@Service
public class ModuloServiceImp implements ModuloService{
	@Autowired
    private ModuloDao modulodao;
	@Override
	public int create(Modulo m) {
		return modulodao.create(m);
	}

	@Override
	public int update(Modulo m) {
		return modulodao.update(m);
	}

	@Override
	public int delete(int id) {
		return modulodao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return modulodao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return modulodao.readAll();
	}

}
