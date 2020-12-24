package pe.edu.com.sysrubricas.security;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import pe.edu.com.sysrubricas.dao.AccesosDao;
import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.dao.UsuarioDao;
import pe.edu.com.sysrubricas.entity.Persona;
import pe.edu.com.sysrubricas.entity.Usuario;




@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private AccesosDao accesoDao;
	@Autowired
	private PersonaDao personaDao;
Gson g = new Gson();
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario user = usuarioDao.read(authentication.getName());
		Persona per = personaDao.read(user.getId_persona());
		List<Map<String,Object>> accesos = new ArrayList<>();
		accesos = accesoDao.read(user.getId_usuario());
		Map<String, Object> datos= new HashMap<>();
		datos.put("iduser", user.getId_usuario());
		datos.put("nombre", per.getNombres());
		datos.put("user", user.getUsername());
		datos.put("accesos", accesos);
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(datos);

		return accessToken;
	}

}
