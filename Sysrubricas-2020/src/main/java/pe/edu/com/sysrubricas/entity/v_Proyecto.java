package pe.edu.com.sysrubricas.entity;

public class v_Proyecto {
		private int id_proyecto;
	    private String lider;
	    private String ciclo;
	    private String semestre;
		public v_Proyecto(int id_proyecto, String lider, String ciclo, String semestre) {
			super();
			this.id_proyecto = id_proyecto;
			this.lider = lider;
			this.ciclo = ciclo;
			this.semestre = semestre;
		}
		public v_Proyecto() {
			super();
		}
		public int getId_proyecto() {
			return id_proyecto;
		}
		public void setId_proyecto(int id_proyecto) {
			this.id_proyecto = id_proyecto;
		}
		public String getLider() {
			return lider;
		}
		public void setLider(String lider) {
			this.lider = lider;
		}
		public String getCiclo() {
			return ciclo;
		}
		public void setCiclo(String ciclo) {
			this.ciclo = ciclo;
		}
		public String getSemestre() {
			return semestre;
		}
		public void setSemestre(String semestre) {
			this.semestre = semestre;
		}
	    
	    
	    
	    
	    
}
