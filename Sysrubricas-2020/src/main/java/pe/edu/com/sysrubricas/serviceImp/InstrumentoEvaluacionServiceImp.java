package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.InstrumentoEvaluacionDao;
import pe.edu.com.sysrubricas.entity.InstrumentoEvaluacion;
import pe.edu.com.sysrubricas.service.InstrumentoEvaluacionService;

@Service
public class InstrumentoEvaluacionServiceImp implements InstrumentoEvaluacionService {
	@Autowired
	private InstrumentoEvaluacionDao ins_evalDao;

	@Override
	public int createInsturentoEvaluacion(InstrumentoEvaluacion ins) {
		// TODO Auto-generated method stub
		return ins_evalDao.createInsturentoEvaluacion(ins);
	}

	@Override
	public int updateInsturentoEvaluacion(InstrumentoEvaluacion ins) {
		// TODO Auto-generated method stub
		return ins_evalDao.updateInsturentoEvaluacion(ins);
	}

	@Override
	public int deleteInsturentoEvaluacion(int id) {
		// TODO Auto-generated method stub
		return ins_evalDao.deleteInsturentoEvaluacion(id);
	}

	@Override
	public Map<String, Object> readInsturentoEvaluacion(int id) {
		// TODO Auto-generated method stub
		return ins_evalDao.readInsturentoEvaluacion(id);
	}

	@Override
	public Map<String, Object> readAllInsturentoEvaluacion() {
		// TODO Auto-generated method stub
		return ins_evalDao.readAllInsturentoEvaluacion();
	}
}
