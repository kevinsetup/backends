package pe.edu.com.sysrubricas.entity;

public class LineaAcademica {
	private int id_linea;
	private String nombre;
	private char estado;
	public LineaAcademica() {
		super();
	}
	public LineaAcademica(int id_linea, String nombre, char estado) {
		super();
		this.id_linea = id_linea;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_linea() {
		return id_linea;
	}
	public void setId_linea(int id_linea) {
		this.id_linea = id_linea;
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
