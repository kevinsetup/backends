package pe.edu.com.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import pe.edu.com.sysrubricas.dao.UsuarioDao;
import pe.edu.com.sysrubricas.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao {
	Gson g = new Gson();
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Usuario validarUsuario(String nomuser) {
		String SQL = "select *from usuarios where username=?";
		Usuario usuario = jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		return usuario;
	}
	@Override
	public Map<String, Object> datosUsuario(String username) {
		String SQL = "SELECT u.id_usuario, r.id_rol, p.nombres, u.username, r.nombre FROM persona p " + 
				"INNER JOIN usuarios u ON u.id_persona = p.id_persona " + 
				"INNER JOIN usuarios_roles ur ON u.id_usuario = ur.id_usuario " + 
				"INNER JOIN roles r ON r.id_rol=ur.id_rol "+
				"where u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from usuarios where idusuario=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}
	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "SELECT *FROM usuarios WHERE username=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
