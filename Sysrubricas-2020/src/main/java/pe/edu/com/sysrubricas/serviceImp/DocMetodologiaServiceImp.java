package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.DocMetodologiaDao;
import pe.edu.com.sysrubricas.entity.DocMetodologia;
import pe.edu.com.sysrubricas.service.DocMetodologiaService;

@Service
public class DocMetodologiaServiceImp implements DocMetodologiaService {
	@Autowired
	private DocMetodologiaDao docMetodologiaDao;

	@Override
	public int createDocMetodologia(DocMetodologia dm) {
		// TODO Auto-generated method stub
		return docMetodologiaDao.createDocMetodologia(dm);
	}

	@Override
	public int updateDocMetodologia(DocMetodologia dm) {
		// TODO Auto-generated method stub
		return docMetodologiaDao.updateDocMetodologia(dm);
	}

	@Override
	public int deleteMetodologia(int id) {
		// TODO Auto-generated method stub
		return docMetodologiaDao.deleteMetodologia(id);
	}

	@Override
	public Map<String, Object> readMetodologia(int id) {
		// TODO Auto-generated method stub
		return docMetodologiaDao.readMetodologia(id);
	}

	@Override
	public Map<String, Object> readAllMetodologia() {
		// TODO Auto-generated method stub
		return docMetodologiaDao.readAllMetodologia();
	}
}
