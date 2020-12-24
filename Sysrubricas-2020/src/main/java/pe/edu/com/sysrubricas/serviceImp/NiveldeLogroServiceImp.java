package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.NiveldeLogroDao;

import pe.edu.com.sysrubricas.entity.NiveldeLogro;

import pe.edu.com.sysrubricas.service.NiveldeLogroService;
@Service
public class NiveldeLogroServiceImp implements NiveldeLogroService {
	@Autowired
	private NiveldeLogroDao ndao;
	@Override
	public int create(NiveldeLogro n) {
		return ndao.create(n);
	}

	@Override
	public int update(NiveldeLogro n) {
		return ndao.update(n);
	}

	@Override
	public int delete(int id) {
		return ndao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return ndao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return ndao.readAll();
	}
}
