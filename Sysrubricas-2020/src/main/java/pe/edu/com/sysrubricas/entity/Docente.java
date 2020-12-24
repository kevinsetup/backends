package pe.edu.com.sysrubricas.entity;

public class Docente {
	
	private String codigo;
	private int idpersona;
	private char estado;
	public Docente() {
		super();
	}
	public Docente(String codigo, int idpersona, char estado) {
		super();
		this.codigo = codigo;
		this.idpersona = idpersona;
		this.estado = estado;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
