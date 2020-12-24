package pe.edu.com.sysrubricas.entity;




public class UnidadAcademica {
	private int id_unidad;
	private String nombre;
	private int id_padre;
	private int id_tipo;
	private char estado;
	public UnidadAcademica(int id_unidad, String nombre, int id_padre, int id_tipo, char estado) {
		super();
		this.id_unidad = id_unidad;
		this.nombre = nombre;
		this.id_padre = id_padre;
		this.id_tipo = id_tipo;
		this.estado = estado;
	}
	
	public UnidadAcademica() {
		super();
	}

	public int getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_padre() {
		return id_padre;
	}
	public void setId_padre(int id_padre) {
		this.id_padre = id_padre;
	}
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
