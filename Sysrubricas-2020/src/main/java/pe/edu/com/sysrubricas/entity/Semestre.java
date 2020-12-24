package pe.edu.com.sysrubricas.entity;

public class Semestre {
	private int id_semestre;
	private String nombre;
	private char estado;
	public Semestre() {
		super();
	}
	public Semestre(int id_semestre, String nombre, char estado) {
		super();
		this.id_semestre = id_semestre;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_semestre() {
		return id_semestre;
	}
	public void setId_semestre(int id_semestre) {
		this.id_semestre = id_semestre;
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
