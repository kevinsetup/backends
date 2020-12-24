package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.ExpertoE;

public interface ExpertoEDao {
	int create(ExpertoE e);
	int update(ExpertoE e);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
