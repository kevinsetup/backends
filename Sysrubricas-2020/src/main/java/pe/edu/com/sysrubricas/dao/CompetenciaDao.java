package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Competencia;

public interface CompetenciaDao {
	int create(Competencia comp);
	int update(Competencia comp);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
	Map<String, Object> readxPlan_l(int id);
}
