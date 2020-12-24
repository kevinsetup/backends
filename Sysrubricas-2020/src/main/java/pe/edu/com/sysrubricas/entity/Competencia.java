package pe.edu.com.sysrubricas.entity;

public class Competencia {
	private int idcomp;
	private String nombre;
	private int idplan_l;
	private String descripcion;
	private String tipo;
	private char estado;
	public Competencia() {
		super();
	}
	public Competencia(int idcomp, String nombre, int idplan_l, String descripcion, String tipo, char estado) {
		super();
		this.idcomp = idcomp;
		this.nombre = nombre;
		this.idplan_l = idplan_l;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.estado = estado;
	}
	public int getIdcomp() {
		return idcomp;
	}
	public void setIdcomp(int idcomp) {
		this.idcomp = idcomp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdplan_l() {
		return idplan_l;
	}
	public void setIdplan_l(int idplan_l) {
		this.idplan_l = idplan_l;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}

}
