package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.LineaAcademica;

public interface LineaAcademicaDao {
	int create(LineaAcademica l);
	int update(LineaAcademica l);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String,Object> readAll();
}
