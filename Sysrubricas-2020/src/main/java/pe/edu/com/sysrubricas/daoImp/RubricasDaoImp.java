package pe.edu.com.sysrubricas.daoImp;

import java.sql.Types;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.com.sysrubricas.dao.RubricasDao;
import pe.edu.com.sysrubricas.entity.Criterio;
import pe.edu.com.sysrubricas.entity.CriterioNivel;
import pe.edu.com.sysrubricas.entity.NivelLogro;
import pe.edu.com.sysrubricas.entity.Rubrica;
import pe.edu.com.sysrubricas.entity.v_CriterioNivel;
import pe.edu.com.sysrubricas.entity.v_Rubrica;
@Component
public class RubricasDaoImp implements RubricasDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createRubrica(Rubrica rubrica) {
		return jdbcTemplate.update("CALL pk_rubricas.SP_CREATE_RUBRICA(?,?)", rubrica.getId_carga(), rubrica.getPeso());

	}
	@Override
	public int createCriterio(Criterio indicador) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL pk_rubricas.SP_CREATE_CRITERIO(? ,?, ? )", indicador.getId_rubricas(), indicador.getNombre(), indicador.getPeso() );
	}
	@Override
	public int createNivelRubrica(CriterioNivel nivelRubrica) {
		return jdbcTemplate.update("CALL PK_RUBRICAS.SP_CREATE_CRITERIO_NIVEL(? , ?, ? )", nivelRubrica.getId_nivel(), nivelRubrica.getId_criterio(),  nivelRubrica.getDescripcion());
		
	}
	public int deletRubrica(int id) {
		return jdbcTemplate.update("CALL PK_RUBRICAS.SP_DELETE_RUBRICA(?)",id);
	}
	
	
	
	@Override
	public List<v_Rubrica> getRubricas(int id) {
	    simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName("PK_RUBRICAS")
                .withProcedureName("SP_LISTAR_RUBRICA")
                .returningResultSet("CURSOR_RUBRICA",
                        BeanPropertyRowMapper.newInstance(v_Rubrica.class));
        Map in = Collections.singletonMap("idpy",id);
      return simpleJdbcCall.executeObject(List.class,in);
	}
	@Override
	public List<v_Rubrica> getOnlyRubrica(int id) {
		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("PK_RUBRICAS")
	                .withProcedureName("SP_LISTAR_SOLORUBRICA")
	                .returningResultSet("CURSOR_S_RUBRICA",
	                        BeanPropertyRowMapper.newInstance(v_Rubrica.class));
	        Map in = Collections.singletonMap("idrubri",id);

	        return simpleJdbcCall.executeObject(List.class,in);
		
	}
	@Override
	public List<Criterio> getCriterio(int id) {
		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("PK_RUBRICAS")
	                .withProcedureName("SP_LISTAR_CRITERIOS")
	                .returningResultSet("CURSOR_CRITERIOS",
	                        BeanPropertyRowMapper.newInstance(Criterio.class));
	        Map in = Collections.singletonMap("idrubri",id);

	        return simpleJdbcCall.executeObject(List.class,in);
	}
	@Override
	public List<Criterio> getOnlyCriterio(int id) {
		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("PK_RUBRICAS")
	                .withProcedureName("SP_LISTAR_SOLOCRITERIO")
	                .returningResultSet("CURSOR_S_CRI",
	                        BeanPropertyRowMapper.newInstance(Criterio.class));
	        Map in = Collections.singletonMap("idcrit",id);
	        return simpleJdbcCall.executeObject(List.class,in);
	}
	@Override
	public List<NivelLogro> getNivelesLogro() {
		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("PK_RUBRICAS")
	                .withProcedureName("SP_LISTAR_NIVELES_LOGRO")
	                .returningResultSet("CURSOR_LOGRO",
	                        BeanPropertyRowMapper.newInstance(NivelLogro.class));
	        return simpleJdbcCall.executeObject(List.class);
	}
	@Override
	public List<v_CriterioNivel> getNivelRubrica(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName("PK_RUBRICAS")
                .withProcedureName("SP_LISTAR_CRITERIO_NIVEL")
                .returningResultSet("CURSOR_NIVEL_RUBRICA",
                		BeanPropertyRowMapper.newInstance(v_CriterioNivel.class));
        Map in = Collections.singletonMap("idcrit",id);
        return simpleJdbcCall.executeObject(List.class,in);
	}
	

	
	
	
	

}
