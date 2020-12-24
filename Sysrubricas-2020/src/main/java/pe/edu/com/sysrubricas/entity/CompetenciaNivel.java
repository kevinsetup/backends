package pe.edu.com.sysrubricas.entity;

public class CompetenciaNivel {
	private int idcomp_n;
	private int idcomp;
	private int idnivel;
	private String saber;
	private String hacer;
	private char estado;
	public CompetenciaNivel() {
		super();
	}
	public CompetenciaNivel(int idcomp_n, int idcomp, int idnivel, String saber, String hacer, char estado) {
		super();
		this.idcomp_n = idcomp_n;
		this.idcomp = idcomp;
		this.idnivel = idnivel;
		this.saber = saber;
		this.hacer = hacer;
		this.estado = estado;
	}
	public int getIdcomp_n() {
		return idcomp_n;
	}
	public void setIdcomp_n(int idcomp_n) {
		this.idcomp_n = idcomp_n;
	}
	public int getIdcomp() {
		return idcomp;
	}
	public void setIdcomp(int idcomp) {
		this.idcomp = idcomp;
	}
	public int getIdnivel() {
		return idnivel;
	}
	public void setIdnivel(int idnivel) {
		this.idnivel = idnivel;
	}
	public String getSaber() {
		return saber;
	}
	public void setSaber(String saber) {
		this.saber = saber;
	}
	public String getHacer() {
		return hacer;
	}
	public void setHacer(String hacer) {
		this.hacer = hacer;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
}
