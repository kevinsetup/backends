package pe.edu.com.sysrubricas.entity;

public class Curso {
	private int idcurso;
	private String nombre;
	private char estado;
	public Curso(int idcurso, String nombre, char estado) {
		super();
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
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
