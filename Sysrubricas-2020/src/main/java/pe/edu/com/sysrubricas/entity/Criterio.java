package pe.edu.com.sysrubricas.entity;

public class Criterio {
    private int id_criterio;
    private int id_rubricas;
    private String nombre;
    private Double peso;
    private String estado;   
	public Criterio() {
		super();
	}
	public Criterio(int id_criterio, int id_rubricas, String nombre, Double peso, String estado) {
		super();
		this.id_criterio = id_criterio;
		this.id_rubricas = id_rubricas;
		this.nombre = nombre;
		this.peso = peso;
		this.estado = estado;
	}
	public int getId_criterio() {
		return id_criterio;
	}
	public void setId_criterio(int id_criterio) {
		this.id_criterio = id_criterio;
	}
	public int getId_rubricas() {
		return id_rubricas;
	}
	public void setId_rubricas(int id_rubricas) {
		this.id_rubricas = id_rubricas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    
    
    
	
	
}
