package pe.edu.com.sysrubricas.entity;

public class PlanLinea {
	private int idplan_l;
	private int idplan;
	private int idlinea;
	private char estado;	
	public PlanLinea() {
		super();
	}
	public PlanLinea(int idplan_l, int idplan, int idlinea, char estado) {
		super();
		this.idplan_l = idplan_l;
		this.idplan = idplan;
		this.idlinea = idlinea;
		this.estado = estado;
	}
	public int getIdplan_l() {
		return idplan_l;
	}
	public void setIdplan_l(int idplan_l) {
		this.idplan_l = idplan_l;
	}
	public int getIdplan() {
		return idplan;
	}
	public void setIdplan(int idplan) {
		this.idplan = idplan;
	}
	public int getIdlinea() {
		return idlinea;
	}
	public void setIdlinea(int idlinea) {
		this.idlinea = idlinea;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
}
