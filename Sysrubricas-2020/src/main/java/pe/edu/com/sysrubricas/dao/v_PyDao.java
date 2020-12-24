package pe.edu.com.sysrubricas.dao;

import java.util.List;

import pe.edu.com.sysrubricas.entity.Curso;
import pe.edu.com.sysrubricas.entity.Proyecto;
import pe.edu.com.sysrubricas.entity.v_Curso;
import pe.edu.com.sysrubricas.entity.v_Proyecto;

public interface v_PyDao {

	 	List<v_Proyecto> getProyecto(int id);
	    List<v_Curso> getCursosxPy(int id);
	    List<v_Proyecto> comoBuscar(int id);
}
