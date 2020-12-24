package pe.edu.com.sysrubricas.entity;

public class Curso_plan {
private int id_curso_plan;
private int id_curso;
private int id_plan;
private String estado;
private int creditos;
private int horas;
private String ciclo;
public Curso_plan(int id_curso_plan, int id_curso, int id_plan, String estado, int creditos, int horas, String ciclo) {
	super();
	this.id_curso_plan = id_curso_plan;
	this.id_curso = id_curso;
	this.id_plan = id_plan;
	this.estado = estado;
	this.creditos = creditos;
	this.horas = horas;
	this.ciclo = ciclo;
}
public Curso_plan() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId_curso_plan() {
	return id_curso_plan;
}
public void setId_curso_plan(int id_curso_plan) {
	this.id_curso_plan = id_curso_plan;
}
public int getId_curso() {
	return id_curso;
}
public void setId_curso(int id_curso) {
	this.id_curso = id_curso;
}
public int getId_plan() {
	return id_plan;
}
public void setId_plan(int id_plan) {
	this.id_plan = id_plan;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public int getCreditos() {
	return creditos;
}
public void setCreditos(int creditos) {
	this.creditos = creditos;
}
public int getHoras() {
	return horas;
}
public void setHoras(int horas) {
	this.horas = horas;
}
public String getCiclo() {
	return ciclo;
}
public void setCiclo(String ciclo) {
	this.ciclo = ciclo;
}

}
