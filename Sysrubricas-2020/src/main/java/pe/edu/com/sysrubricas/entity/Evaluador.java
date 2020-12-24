package pe.edu.com.sysrubricas.entity;

public class Evaluador {
	private int  idevaluador; 
	private int id_persona;
	private int id_proyecto;
	private String tipo;
	private int estado;
	public Evaluador() {
		super();
	}
	public Evaluador(int idevaluador, int id_persona, int id_proyecto, String tipo, int estado) {
		super();
		this.idevaluador = idevaluador;
		this.id_persona = id_persona;
		this.id_proyecto = id_proyecto;
		this.tipo = tipo;
		this.estado = estado;
	}
	public int getIdevaluador() {
		return idevaluador;
	}
	public void setIdevaluador(int idevaluador) {
		this.idevaluador = idevaluador;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public int getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
}
