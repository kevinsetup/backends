package pe.edu.com.sysrubricas.entity;

public class v_CriterioNivel {
		private int id_criterio_nivel;
	    private int id_criterio;
	    private String nombre;
	    private Double peso;
	    private String descripcion;
		public v_CriterioNivel(int id_criterio_nivel, int id_criterio, String nombre, Double peso, String descripcion) {
			super();
			this.id_criterio_nivel = id_criterio_nivel;
			this.id_criterio = id_criterio;
			this.nombre = nombre;
			this.peso = peso;
			this.descripcion = descripcion;
		}
		public v_CriterioNivel() {
			super();
		}
		public int getId_criterio_nivel() {
			return id_criterio_nivel;
		}
		public void setId_criterio_nivel(int id_criterio_nivel) {
			this.id_criterio_nivel = id_criterio_nivel;
		}
		public int getId_criterio() {
			return id_criterio;
		}
		public void setId_criterio(int id_criterio) {
			this.id_criterio = id_criterio;
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
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
	    
	    
	    
	    
	    
	    
}	
