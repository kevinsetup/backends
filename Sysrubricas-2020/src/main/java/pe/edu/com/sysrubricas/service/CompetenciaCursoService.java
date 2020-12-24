package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.CompetenciaCurso;

public interface CompetenciaCursoService {
	int create(CompetenciaCurso cc);
	int update(CompetenciaCurso cc);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
	Map<String, Object> readDinamic(int id);
}
