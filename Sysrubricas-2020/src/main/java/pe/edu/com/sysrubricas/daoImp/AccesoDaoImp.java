package pe.edu.com.sysrubricas.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.com.sysrubricas.dao.AccesosDao;
import pe.edu.com.sysrubricas.entity.Acceso;
@Repository
public class AccesoDaoImp implements AccesosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Acceso a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Acceso a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		String SQL ="select a.nomacceso, a.url, a.icono from acceso a " + 
				"INNER JOIN roles_acceso rc ON a.idacceso = rc.idacceso " + 
				"INNER JOIN roles r ON rc.idrol = r.id_rol " + 
				"INNER JOIN usuarios_roles uc ON r.id_rol = uc.id_rol " + 
				"INNER JOIN usuarios u ON uc.id_usuario = u.id_usuario " + 
				"WHERE u.id_usuario=?";
		return jdbcTemplate.queryForList(SQL,new Object[] {id});
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll(String username) {
		String SQL = "select a.nomacceso, a.url, a.icono from acceso a " + 
				"INNER JOIN roles_acceso rc ON a.idacceso = rc.idacceso " + 
				"INNER JOIN roles r ON rc.idrol = r.id_rol " + 
				"INNER JOIN usuarios_roles uc ON r.id_rol = uc.id_rol " + 
				"INNER JOIN usuarios u ON uc.id_usuario = u.id_usuario " + 
				"WHERE u.username=?";
		return null;
	}

}
