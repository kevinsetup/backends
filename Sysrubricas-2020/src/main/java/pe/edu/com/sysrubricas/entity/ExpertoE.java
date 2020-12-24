package pe.edu.com.sysrubricas.entity;

public class ExpertoE {

	private int idexpertoe;
	private int idpersona;
	private char estado;
	public int getIdexpertoe() {
		return idexpertoe;
	}
	public void setIdexpertoe(int idexpertoe) {
		this.idexpertoe = idexpertoe;
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
	public ExpertoE() {
		super();
	}
	public ExpertoE(int idexpertoe, int idpersona, char estado) {
		super();
		this.idexpertoe = idexpertoe;
		this.idpersona = idpersona;
		this.estado = estado;
	}
	
	
	
	
	
}
