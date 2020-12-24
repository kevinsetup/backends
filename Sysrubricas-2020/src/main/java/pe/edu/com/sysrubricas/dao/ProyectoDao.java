package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Proyecto;

public interface ProyectoDao {
	int create(Proyecto p);
	int update(Proyecto p);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String,Object> readAll();
	Map<String, Object> readxUnidad(int id);
}
