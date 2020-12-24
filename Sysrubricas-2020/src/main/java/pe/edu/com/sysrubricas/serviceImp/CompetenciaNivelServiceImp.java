package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.CompetenciaNivelDao;
import pe.edu.com.sysrubricas.entity.CompetenciaNivel;
import pe.edu.com.sysrubricas.service.CompetenciaNivelService;

@Service
public class CompetenciaNivelServiceImp implements CompetenciaNivelService {
	@Autowired
	private CompetenciaNivelDao cnd;
	@Override
	public int create(CompetenciaNivel cn) {
		// TODO Auto-generated method stub
		return cnd.create(cn);
	}

	@Override
	public int update(CompetenciaNivel cn) {
		// TODO Auto-generated method stub
		return cnd.update(cn);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cnd.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return cnd.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return cnd.readAll();
	}
	@Override
	public Map<String, Object> readAllDin(int id){
		return cnd.readAllDin(id);
	}
	@Override
	public Map<String, Object> selector(int id){
		return cnd.selector(id);
	}
}
