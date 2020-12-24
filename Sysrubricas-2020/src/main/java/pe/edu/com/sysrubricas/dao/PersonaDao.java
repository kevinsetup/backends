package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Persona;

public interface PersonaDao {
	int create(Persona p);
	int update(Persona p);
	int delete(int id);
	Persona read(int id);
	Map<String, Object> readAll();
}
