package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.CursoProyecto;

public interface CursoProyectoDao {
	int createCursoProyecto (CursoProyecto cp);
	int updateCursoProyecto (CursoProyecto cp);
	int deleteCursoProyecto(int id);
	Map<String, Object> readCursoProyecto(int id);
	Map<String, Object> readAllCursoProyecto();
}
