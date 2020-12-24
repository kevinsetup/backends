package pe.edu.com.sysrubricas.entity;

public class Modulo {
private int idmodulo;
private String nombremod;
private char estado;
public Modulo() {
	super();
}
public Modulo(int idmodulo, String nombremod, char estado) {
	super();
	this.idmodulo = idmodulo;
	this.nombremod = nombremod;
	this.estado = estado;
}
public int getIdmodulo() {
	return idmodulo;
}
public void setIdmodulo(int idmodulo) {
	this.idmodulo = idmodulo;
}
public String getNombremod() {
	return nombremod;
}
public void setNombremod(String nombremod) {
	this.nombremod = nombremod;
}
public char getEstado() {
	return estado;
}
public void setEstado(char estado) {
	this.estado = estado;
}
}
