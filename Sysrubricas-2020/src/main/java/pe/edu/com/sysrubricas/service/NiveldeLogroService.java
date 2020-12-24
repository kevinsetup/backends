package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.NiveldeLogro;


public interface NiveldeLogroService {
	int create(NiveldeLogro n);
	int update(NiveldeLogro n);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
