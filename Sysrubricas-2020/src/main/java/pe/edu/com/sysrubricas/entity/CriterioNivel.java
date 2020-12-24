package pe.edu.com.sysrubricas.entity;

public class CriterioNivel {
	 	private int id_criterio_nivel;
	    private int id_nivel;
	    private int id_criterio;
	    private String descripcion;
	    private String estado;
		public CriterioNivel(int id_criterio_nivel, int id_nivel, int id_criterio, String descripcion, String estado) {
			super();
			this.id_criterio_nivel = id_criterio_nivel;
			this.id_nivel = id_nivel;
			this.id_criterio = id_criterio;
			this.descripcion = descripcion;
			this.estado = estado;
		}
		public CriterioNivel() {
			super();
		}
		public int getId_criterio_nivel() {
			return id_criterio_nivel;
		}
		public void setId_criterio_nivel(int id_criterio_nivel) {
			this.id_criterio_nivel = id_criterio_nivel;
		}
		public int getId_nivel() {
			return id_nivel;
		}
		public void setId_nivel(int id_nivel) {
			this.id_nivel = id_nivel;
		}
		public int getId_criterio() {
			return id_criterio;
		}
		public void setId_criterio(int id_criterio) {
			this.id_criterio = id_criterio;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
	    
	    
	    
	    
	   
	    
	    
	    
}
