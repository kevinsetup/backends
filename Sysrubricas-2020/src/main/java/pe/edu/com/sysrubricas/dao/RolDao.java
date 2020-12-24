package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.edu.com.sysrubricas.entity.Rol;
import java.util.List;

public interface RolDao {
		int create(Rol r);
		int update(Rol r);
		int delete(int id);
		Map<String, Object> read(int id);
		Map<String, Object> readAll();
		List<GrantedAuthority> buscarRolUser(int iduser);
		List<Rol> readHola(int id);

}
