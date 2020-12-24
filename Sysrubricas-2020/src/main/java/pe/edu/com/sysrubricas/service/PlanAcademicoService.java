package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.PlanAcademico;

public interface PlanAcademicoService {
	int create(PlanAcademico p);
	int update(PlanAcademico p);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
	Map<String, Object> readxUnidad(int id);
	Map<String, Object> readPlanforSelector(int id);
}
