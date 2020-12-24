package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.DocMetodologia;

public interface DocMetodologiaDao {
	int createDocMetodologia(DocMetodologia dm);
	int updateDocMetodologia(DocMetodologia dm);
	int deleteMetodologia(int id);
	Map<String, Object> readMetodologia(int id);
	Map<String,Object> readAllMetodologia();
}
