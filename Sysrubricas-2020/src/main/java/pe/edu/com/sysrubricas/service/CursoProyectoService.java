package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.CursoProyecto;

public interface CursoProyectoService {
	int createCursoProyecto (CursoProyecto cp);
	int updateCursoProyecto (CursoProyecto cp);
	int deleteCursoProyecto(int id);
	Map<String, Object> readCursoProyecto(int id);
	Map<String, Object> readAllCursoProyecto();
}
