package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Docente;

public interface DocenteService {
	int create(Docente d);
	int update(Docente d);
	int delete(String codigo);
	Map<String,Object> read(String id);
	Map<String,Object> readAll();
	Map<String, Object> readDinamico();
}
