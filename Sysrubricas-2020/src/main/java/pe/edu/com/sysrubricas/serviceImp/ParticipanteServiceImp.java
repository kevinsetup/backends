package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.ParticipanteDao;
import pe.edu.com.sysrubricas.entity.Participante;
import pe.edu.com.sysrubricas.service.ParticipanteService;

@Service
public class ParticipanteServiceImp implements ParticipanteService {
	@Autowired
	private ParticipanteDao participanteDao;
	@Override
	public int create(Participante p) {
		// TODO Auto-generated method stub
		return participanteDao.create(p);
	}

	@Override
	public int update(Participante l) {
		// TODO Auto-generated method stub
		return participanteDao.update(l);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return participanteDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return participanteDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return participanteDao.readAll();
	}

}
