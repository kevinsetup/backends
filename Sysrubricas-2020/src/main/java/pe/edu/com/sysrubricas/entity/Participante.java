package pe.edu.com.sysrubricas.entity;

public class Participante {
	private int id_participante;
	private int id_persona;
	private int id_proyecto;
	private String tipo;
	private char estado;
	public Participante() {
		super();
	}
	public Participante(int id_participante, int id_persona, int id_proyecto, String tipo, char estado) {
		super();
		this.id_participante = id_participante;
		this.id_persona = id_persona;
		this.id_proyecto = id_proyecto;
		this.tipo = tipo;
		this.estado = estado;
	}
	public int getId_participante() {
		return id_participante;
	}
	public void setId_participante(int id_participante) {
		this.id_participante = id_participante;
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
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
}
