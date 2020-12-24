package pe.edu.com.sysrubricas.entity;

public class DocMetodologia {
	private int id_metodologia;
	private int id_unidad;
	private int id_semestre;
	private String documento;
	private int estado;
	public DocMetodologia() {
		super();
	}
	public DocMetodologia(int id_metodologia, int id_unidad, int id_semestre, String documento, int estado) {
		super();
		this.id_metodologia = id_metodologia;
		this.id_unidad = id_unidad;
		this.id_semestre = id_semestre;
		this.documento = documento;
		this.estado = estado;
	}
	public int getId_metodologia() {
		return id_metodologia;
	}
	public void setId_metodologia(int id_metodologia) {
		this.id_metodologia = id_metodologia;
	}
	public int getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}
	public int getId_semestre() {
		return id_semestre;
	}
	public void setId_semestre(int id_semestre) {
		this.id_semestre = id_semestre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
