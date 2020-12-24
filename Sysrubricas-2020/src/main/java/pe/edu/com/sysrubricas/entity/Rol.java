package pe.edu.com.sysrubricas.entity;

public class Rol {
	private int id_rol;
	private String nombre;
	private char estado;
	public Rol(int id_rol, String nombre, char estado) {
		super();
		this.id_rol = id_rol;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Rol() {
		super();
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
}
