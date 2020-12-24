package pe.edu.com.sysrubricas.entity;

public class v_Curso {
	 private int id_carga;
	    private int id_proyecto;
	    private int id_curso_proyecto;
	    private String curso;
	    private String docente;
		public v_Curso(int id_carga, int id_proyecto, int id_curso_proyecto, String curso, String docente) {
			super();
			this.id_carga = id_carga;
			this.id_proyecto = id_proyecto;
			this.id_curso_proyecto = id_curso_proyecto;
			this.curso = curso;
			this.docente = docente;
		}
		public v_Curso() {
			super();
		}
		public int getId_carga() {
			return id_carga;
		}
		public void setId_carga(int id_carga) {
			this.id_carga = id_carga;
		}
		public int getId_proyecto() {
			return id_proyecto;
		}
		public void setId_proyecto(int id_proyecto) {
			this.id_proyecto = id_proyecto;
		}
		public int getId_curso_proyecto() {
			return id_curso_proyecto;
		}
		public void setId_curso_proyecto(int id_curso_proyecto) {
			this.id_curso_proyecto = id_curso_proyecto;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public String getDocente() {
			return docente;
		}
		public void setDocente(String docente) {
			this.docente = docente;
		}
		
	    
	    
	    
	    
}
