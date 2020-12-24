package pe.edu.com.sysrubricas.serviceImp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import pe.edu.com.sysrubricas.dao.RolDao;
import pe.edu.com.sysrubricas.dao.UsuarioDao;
import pe.edu.com.sysrubricas.entity.Usuario;




@Service("userService")
public class UsuarioService implements UserDetailsService{
	Gson g = new Gson();
   @Autowired
	private UsuarioDao usuarioDao;
   @Autowired
	private RolDao rolDao;
   
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		Usuario usuario = usuarioDao.validarUsuario(username);
		System.out.println(g.toJson(rolDao.buscarRolUser(usuario.getId_usuario())));
		UserDetails details = new User(usuario.getUsername(),usuario.getPassword(),rolDao.buscarRolUser(usuario.getId_usuario()));
		return details;
	}

}
