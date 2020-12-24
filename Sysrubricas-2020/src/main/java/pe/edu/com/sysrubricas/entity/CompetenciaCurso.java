package pe.edu.com.sysrubricas.entity;

public class CompetenciaCurso {
	private int idcomp_c;
	private int id_curso_plan;
	private int idcomp_n;
	private char estado;	
	public CompetenciaCurso() {
		super();
	}
	public CompetenciaCurso(int idcomp_c, int id_curso_plan, int idcomp_n, char estado) {
		super();
		this.idcomp_c = idcomp_c;
		this.id_curso_plan = id_curso_plan;
		this.idcomp_n = idcomp_n;
		this.estado = estado;
	}
	public int getIdcomp_c() {
		return idcomp_c;
	}
	public void setIdcomp_c(int idcomp_c) {
		this.idcomp_c = idcomp_c;
	}
	public int getId_curso_plan() {
		return id_curso_plan;
	}
	public void setId_curso_plan(int id_curso_plan) {
		this.id_curso_plan = id_curso_plan;
	}
	public int getIdcomp_n() {
		return idcomp_n;
	}
	public void setIdcomp_n(int idcomp_n) {
		this.idcomp_n = idcomp_n;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
}
