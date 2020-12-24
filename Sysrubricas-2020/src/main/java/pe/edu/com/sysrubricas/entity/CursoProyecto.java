package pe.edu.com.sysrubricas.entity;

public class CursoProyecto {
	private int id_curso_proy;
	private int id_proyecto;
	private int id_carga;
	private int estado;
	public CursoProyecto() {
		super();
	}
	public CursoProyecto(int id_curso_proy, int id_proyecto, int id_carga, int estado) {
		super();
		this.id_curso_proy = id_curso_proy;
		this.id_proyecto = id_proyecto;
		this.id_carga = id_carga;
		this.estado = estado;
	}
	public int getId_curso_proy() {
		return id_curso_proy;
	}
	public void setId_curso_proy(int id_curso_proy) {
		this.id_curso_proy = id_curso_proy;
	}
	public int getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public int getId_carga() {
		return id_carga;
	}
	public void setId_carga(int id_carga) {
		this.id_carga = id_carga;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
