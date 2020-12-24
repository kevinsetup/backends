package pe.edu.com.sysrubricas.entity;

public class Proyecto {
	private int id_proyecto;
	private int id_semestre;
	private String estado;
	private String ciclo;
	private int grupos;
	private int id_persona;
	private String nombre;
	private int idunidad;
	public Proyecto(int id_proyecto, int id_semestre, String estado, String ciclo, int grupos, int id_persona,
			String nombre, int idunidad) {
		super();
		this.id_proyecto = id_proyecto;
		this.id_semestre = id_semestre;
		this.estado = estado;
		this.ciclo = ciclo;
		this.grupos = grupos;
		this.id_persona = id_persona;
		this.nombre = nombre;
		this.idunidad = idunidad;
	}
	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public int getId_semestre() {
		return id_semestre;
	}
	public void setId_semestre(int id_semestre) {
		this.id_semestre = id_semestre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public int getGrupos() {
		return grupos;
	}
	public void setGrupos(int grupos) {
		this.grupos = grupos;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
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

}

