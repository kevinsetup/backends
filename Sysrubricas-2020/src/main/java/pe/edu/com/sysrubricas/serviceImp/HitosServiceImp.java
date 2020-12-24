package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.HitosDao;
import pe.edu.com.sysrubricas.entity.Hitos;
import pe.edu.com.sysrubricas.service.HitosService;
@Service
public class HitosServiceImp implements HitosService  {
	@Autowired
	private HitosDao hitosDao;
	@Override
	public int createHitos(Hitos h) {
		// TODO Auto-generated method stub
		return hitosDao.createHitos(h);
	}

	@Override
	public int updateHitos(Hitos h) {
		// TODO Auto-generated method stub
		return hitosDao.updateHitos(h);
	}

	@Override
	public int deleteHitos(int id) {
		// TODO Auto-generated method stub
		return hitosDao.deleteHitos(id);
	}

	@Override
	public Map<String, Object> readHitos(int id) {
		// TODO Auto-generated method stub
		return hitosDao.readHitos(id);
	}

	@Override
	public Map<String, Object> readAllHitos() {
		// TODO Auto-generated method stub
		return hitosDao.readAllHitos();
	}

}
