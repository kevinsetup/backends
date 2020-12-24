package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Curso;

public interface CursoService {
	int create(Curso c);
	int update (Curso c);
	int delete  (int c);
	Map<String, Object> read (int id);
	Map<String, Object> readAll();
}
