package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Curso_plan;

public interface Curso_planDao {
int create (Curso_plan cp);
int update (Curso_plan cp);
int delete (int id);
Map<String, Object> readAll();
Map<String, Object> read(int id);
Map<String, Object> readcpp(int id);
Map<String, Object> readxPlan(int id);

}
