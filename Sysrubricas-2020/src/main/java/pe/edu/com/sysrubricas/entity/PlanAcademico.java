package pe.edu.com.sysrubricas.entity;


public class PlanAcademico {
	private int idplan;
	private String nombre;
	private int idunidad;
	private int ciclos;
	private int cursos;
	private int creditos;
	private String anio_inicio;
	private String anio_termino;
	private char estado;
	
	public PlanAcademico() {
		super();
	}
	public PlanAcademico(int idplan, String nombre, int idunidad, int ciclos, int cursos, int creditos,
			String anio_inicio, String anio_termino, char estado) {
		super();
		this.idplan = idplan;
		this.nombre = nombre;
		this.idunidad = idunidad;
		this.ciclos = ciclos;
		this.cursos = cursos;
		this.creditos = creditos;
		this.anio_inicio = anio_inicio;
		this.anio_termino = anio_termino;
		this.estado = estado;
	}
	public int getIdplan() {
		return idplan;
	}
	public void setIdplan(int idplan) {
		this.idplan = idplan;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdunidad() {
		return idunidad;
	}
	public void setIdunidad(int idunidad) {
		this.idunidad = idunidad;
	}
	public int getCiclos() {
		return ciclos;
	}
	public void setCiclos(int ciclos) {
		this.ciclos = ciclos;
	}
	public int getCursos() {
		return cursos;
	}
	public void setCursos(int cursos) {
		this.cursos = cursos;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String getAnio_inicio() {
		return anio_inicio;
	}
	public void setAnio_inicio(String anio_inicio) {
		this.anio_inicio = anio_inicio;
	}
	public String getAnio_termino() {
		return anio_termino;
	}
	public void setAnio_termino(String anio_termino) {
		this.anio_termino = anio_termino;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
}
