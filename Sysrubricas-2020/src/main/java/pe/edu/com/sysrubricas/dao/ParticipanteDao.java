package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Participante;

public interface ParticipanteDao {
	int create(Participante p);
	int update(Participante l);
	int  delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
	
}
