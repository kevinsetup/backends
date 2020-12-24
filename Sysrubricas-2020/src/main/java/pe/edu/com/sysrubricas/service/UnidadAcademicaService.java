package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.UnidadAcademica;

public interface UnidadAcademicaService {
	int create(UnidadAcademica u);
	int update(UnidadAcademica u);
	UnidadAcademica readUpdate(int id);
	Map<String,Object> delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
	Map<String,Object> Campus();
	Map<String,Object> readCampus(String nom);
	Map<String, Object> traerEscuela(int id);
}
