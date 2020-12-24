package pe.edu.com.sysrubricas.entity;

public class NivelLogro {
	  private int id_nivel;
	    private String nombre;
	    private Double peso;
	    private String estado;
	    
	    

	    
		public NivelLogro() {
			super();
		}
		public NivelLogro(int id_nivel, String nombre, Double peso, String estado) {
			super();
			this.id_nivel = id_nivel;
			this.nombre = nombre;
			this.peso = peso;
			this.estado = estado;
		}
		public int getId_nivel() {
			return id_nivel;
		}
		public void setId_nivel(int id_nivel) {
			this.id_nivel = id_nivel;
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
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
	    
	    
	    
	    
	    
}
