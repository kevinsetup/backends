package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.PlanLinea;

public interface PlanLineaDao {
	int create (PlanLinea pl);
	int update (PlanLinea pl);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
	Map<String, Object> readAllDin();
	Map<String, Object> lineasxPlan(int id);
}

