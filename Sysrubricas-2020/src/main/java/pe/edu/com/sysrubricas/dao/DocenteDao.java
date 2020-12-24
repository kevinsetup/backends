package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Docente;

public interface DocenteDao {
	int create(Docente d);
	int update(Docente d);
	int delete(String codigo);
	Map<String,Object> read(String id);
	Map<String,Object> readAll();
	Map<String, Object> readDinamico();
}
