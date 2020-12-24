package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Hitos;

public interface HitosDao {
	int createHitos (Hitos h);
	int updateHitos (Hitos h);
	int deleteHitos(int id);
	Map<String, Object> readHitos(int id);
	Map<String, Object> readAllHitos();
}
