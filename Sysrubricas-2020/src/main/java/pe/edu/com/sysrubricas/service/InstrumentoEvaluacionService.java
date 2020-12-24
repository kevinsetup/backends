package pe.edu.com.sysrubricas.service;

import java.util.Map;



import pe.edu.com.sysrubricas.entity.InstrumentoEvaluacion;

public interface InstrumentoEvaluacionService {
	int createInsturentoEvaluacion(InstrumentoEvaluacion ins);
	int updateInsturentoEvaluacion(InstrumentoEvaluacion ins);
	int deleteInsturentoEvaluacion(int id);
	Map<String, Object> readInsturentoEvaluacion(int id);
	Map<String,Object> readAllInsturentoEvaluacion();
}
