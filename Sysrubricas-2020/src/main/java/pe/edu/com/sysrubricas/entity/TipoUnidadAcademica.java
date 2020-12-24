package pe.edu.com.sysrubricas.entity;

public class TipoUnidadAcademica {
	private int id_tipoUnidad;
	private String nombre;
	private char estado;
	public TipoUnidadAcademica(int id_tipoUnidad, String nombre, char estado) {
		super();
		this.id_tipoUnidad = id_tipoUnidad;
		this.nombre = nombre;
		this.estado = estado;
	}
	public TipoUnidadAcademica() {
		super();
	}
	public int getId_tipoUnidad() {
		return id_tipoUnidad;
	}
	public void setId_tipoUnidad(int id_tipoUnidad) {
		this.id_tipoUnidad = id_tipoUnidad;
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
