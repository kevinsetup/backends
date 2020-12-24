package pe.edu.com.sysrubricas.entity;

public class Rubrica {
	   private int id_rubricas;
	    private int id_carga;
	    private String estado;
	    private int peso;
		public Rubrica(int id_rubricas, int id_carga, String estado, int peso) {
			super();
			this.id_rubricas = id_rubricas;
			this.id_carga = id_carga;
			this.estado = estado;
			this.peso = peso;
		}
		public int getId_rubricas() {
			return id_rubricas;
		}
		public void setId_rubricas(int id_rubricas) {
			this.id_rubricas = id_rubricas;
		}
		public int getId_carga() {
			return id_carga;
		}
		public void setId_carga(int id_carga) {
			this.id_carga = id_carga;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public int getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			this.peso = peso;
		}
		
	    
		
	    
	    
	    
	    
	    
	    
}
