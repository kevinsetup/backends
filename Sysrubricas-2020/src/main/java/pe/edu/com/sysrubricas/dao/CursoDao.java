package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Curso;

public interface CursoDao {
	int create(Curso c);
	int update (Curso c);
	int delete  (int c);
	Map<String, Object> read (int id);
	Map<String, Object> readAll();
}
