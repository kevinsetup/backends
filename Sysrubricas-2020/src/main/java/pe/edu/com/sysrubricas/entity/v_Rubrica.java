package pe.edu.com.sysrubricas.entity;

public class v_Rubrica {
    private int id_rubricas;
    private int id_carga;
    private int id_proyecto;
    private String curso;
    private Double peso;
    private String estado;
	public v_Rubrica(int id_rubricas, int id_carga, int id_proyecto, String curso, Double peso, String estado) {
		super();
		this.id_rubricas = id_rubricas;
		this.id_carga = id_carga;
		this.id_proyecto = id_proyecto;
		this.curso = curso;
		this.peso = peso;
		this.estado = estado;
	}
	public v_Rubrica() {
		super();
	}
	public int getId_rubricas() {
		return id_rubricas;
	}
	public void setId_rubricas(int id_rubricas) {
		this.id_rubricas = id_rubricas;
	}
	public int getId_carga() {
		return id_carga;
	}
	public void setId_carga(int id_carga) {
		this.id_carga = id_carga;
	}
	public int getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
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
