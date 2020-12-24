package pe.edu.com.sysrubricas.service;
import java.util.Map;
import pe.edu.com.sysrubricas.entity.Semestre;
public interface SemestreService {
	int create(Semestre s);
	int update(Semestre s);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
