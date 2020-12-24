package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Hitos;

public interface HitosService {
	int createHitos (Hitos h);
	int updateHitos (Hitos h);
	int deleteHitos(int id);
	Map<String, Object> readHitos(int id);
	Map<String, Object> readAllHitos();
}
