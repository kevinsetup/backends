package pe.edu.com.sysrubricas.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.v_PyDao;
import pe.edu.com.sysrubricas.entity.v_Curso;
import pe.edu.com.sysrubricas.entity.v_Proyecto;
import pe.edu.com.sysrubricas.service.v_PyService;
@Service
public class v_PyServiceImp implements v_PyService {
	  @Autowired
	    private v_PyDao proyectoDao;

	@Override
	public List<v_Proyecto> getProyecto(int id) {
		 return proyectoDao.getProyecto(id);
	}

	@Override
	public List<v_Curso> getCursosxPy(int id) {
		 return proyectoDao.getCursosxPy(id);
	}

	@Override
	public List<v_Proyecto> comoBuscar(int id) {
        return proyectoDao.comoBuscar(id);

	}



	

}
