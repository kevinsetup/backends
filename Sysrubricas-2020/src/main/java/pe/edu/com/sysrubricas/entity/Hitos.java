package pe.edu.com.sysrubricas.entity;

public class Hitos {
 private int id_hito;
 private String fecha;
 private String documento;
 private  int id_curso_proy;
public Hitos() {
	super();
}
public Hitos(int id_hito, String fecha, String documento, int id_curso_proy) {
	super();
	this.id_hito = id_hito;
	this.fecha = fecha;
	this.documento = documento;
	this.id_curso_proy = id_curso_proy;
}
public int getId_hito() {
	return id_hito;
}
public void setId_hito(int id_hito) {
	this.id_hito = id_hito;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getDocumento() {
	return documento;
}
public void setDocumento(String documento) {
	this.documento = documento;
}
public int getId_curso_proy() {
	return id_curso_proy;
}
public void setId_curso_proy(int id_curso_proy) {
	this.id_curso_proy = id_curso_proy;
}
}
