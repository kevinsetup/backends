package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.edu.com.sysrubricas.dao.AccesosDao;
import pe.edu.com.sysrubricas.dao.UsuarioDao;

@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	AccesosDao pdao;
	@Autowired
	UsuarioDao pdao2;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Test
	void contextLoads() {
		System.out.println(passwordEncoder.encode("12345"));
	}	
}	





