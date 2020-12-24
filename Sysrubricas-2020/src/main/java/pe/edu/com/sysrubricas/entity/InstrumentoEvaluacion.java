package pe.edu.com.sysrubricas.entity;

public class InstrumentoEvaluacion {
	private int id_instrumento;
	private int id_metodologia;
	private String nombre;
	private int porcentaje;
	private  String observacion;
	private String validacion;
	public InstrumentoEvaluacion() {
		super();
	}
	public InstrumentoEvaluacion(int id_instrumento, int id_metodologia, String nombre, int porcentaje,
			String observacion, String validacion) {
		super();
		this.id_instrumento = id_instrumento;
		this.id_metodologia = id_metodologia;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.observacion = observacion;
		this.validacion = validacion;
	}
	public int getId_instrumento() {
		return id_instrumento;
	}
	public void setId_instrumento(int id_instrumento) {
		this.id_instrumento = id_instrumento;
	}
	public int getId_metodologia() {
		return id_metodologia;
	}
	public void setId_metodologia(int id_metodologia) {
		this.id_metodologia = id_metodologia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getValidacion() {
		return validacion;
	}
	public void setValidacion(String validacion) {
		this.validacion = validacion;
	}
	
}
