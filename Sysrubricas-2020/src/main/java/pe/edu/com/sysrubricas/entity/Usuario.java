package pe.edu.com.sysrubricas.entity;

public class Usuario {
	private int id_usuario;
	private String username;
	private String password;
	private int id_persona;
	private char estado;
	public Usuario(int id_usuario, String username, String password, int id_persona, char estado) {
		super();
		this.id_usuario = id_usuario;
		this.username = username;
		this.password = password;
		this.id_persona = id_persona;
		this.estado = estado;
	}
	public Usuario() {
		super();
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
