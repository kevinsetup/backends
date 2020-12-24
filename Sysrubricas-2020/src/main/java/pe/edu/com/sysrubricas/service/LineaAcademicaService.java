package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.LineaAcademica;

public interface LineaAcademicaService {
	int create(LineaAcademica l);
	int update(LineaAcademica l);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
