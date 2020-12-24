package pe.edu.com.sysrubricas.entity;

public class NiveldeLogro {
	private int id_nivel;
	private String nombre;
	private char estado;
	
	public NiveldeLogro() {
		super();
	}
	public NiveldeLogro(int id_nivel, String nombre, char estado) {
		super();
		this.id_nivel = id_nivel;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_nivel() {
		return id_nivel;
	}
	public void setId_nivel(int id_nivel) {
		this.id_nivel = id_nivel;
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
