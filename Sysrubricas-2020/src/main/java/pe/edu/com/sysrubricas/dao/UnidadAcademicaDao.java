package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
import pe.edu.com.sysrubricas.entity.UnidadAcademica;

public interface UnidadAcademicaDao {
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
