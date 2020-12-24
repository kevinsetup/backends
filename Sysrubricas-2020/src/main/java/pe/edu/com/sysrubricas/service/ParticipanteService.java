package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Participante;

public interface ParticipanteService {
	int create(Participante p);
	int update(Participante l);
	int  delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
