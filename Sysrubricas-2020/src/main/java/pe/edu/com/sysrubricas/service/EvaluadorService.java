package pe.edu.com.sysrubricas.service;

import java.util.Map;



import pe.edu.com.sysrubricas.entity.Evaluador;


public interface EvaluadorService {
	int createEvaluador (Evaluador ev);
	int updateEvaluador (Evaluador ev);
	int deleteEvaluador(int id);
	Map<String, Object> readEvaluador(int id);
	Map<String, Object> readAllEvaluador();

}
