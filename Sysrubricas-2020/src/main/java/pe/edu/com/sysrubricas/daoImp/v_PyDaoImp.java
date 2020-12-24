package pe.edu.com.sysrubricas.daoImp;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.com.sysrubricas.dao.v_PyDao;
import pe.edu.com.sysrubricas.entity.Curso;
import pe.edu.com.sysrubricas.entity.v_Curso;
import pe.edu.com.sysrubricas.entity.v_Proyecto;
@Repository
public class v_PyDaoImp implements v_PyDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall simpleJdbcCall;

	@Override
	public List<v_Proyecto> getProyecto(int id) {
		  simpleJdbcCall  = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("PK_RUBRICAS")
	                .withProcedureName("SP_LISTAR_PYXSEMESTRE")
	                .returningResultSet("CURSOR_PYXSEM",
	                        BeanPropertyRowMapper.newInstance(v_Proyecto.class));
	        Map in = Collections.singletonMap("id",id);
	        return simpleJdbcCall.executeObject(List.class,in);
	}

	@Override
	public List<v_Curso> getCursosxPy(int id) {
	     simpleJdbcCall  = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("PK_RUBRICAS")
	                .withProcedureName("SP_LISTAR_DETALLEPROYECTO")
	                .returningResultSet("CURSOR_DETALLEPY",
	                        BeanPropertyRowMapper.newInstance(v_Curso.class));
	        Map in = Collections.singletonMap("idpy",id);
	        return simpleJdbcCall.executeObject(List.class,in);
	}

	@Override
	public List<v_Proyecto> comoBuscar(int id) {
		   simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("D_CRUD_HEARTH_SHAKER")
	                .withProcedureName("SPP_GET_PROYECTO")
	                .returningResultSet("OUT_ONLY_PROYECTO",
	                        BeanPropertyRowMapper.newInstance(v_Proyecto.class));
	        Map in = Collections.singletonMap("IDPRO",id);
	        return simpleJdbcCall.executeObject(List.class,in);
	}

}
