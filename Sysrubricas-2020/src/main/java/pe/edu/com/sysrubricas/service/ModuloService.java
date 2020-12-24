package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Modulo;

public interface ModuloService {
	int create(Modulo m);
	int update(Modulo m);
	int delete(int id);
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
