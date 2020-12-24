package pe.edu.com.sysrubricas.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.com.sysrubricas.dao.TipoUnidadAcademicaDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
import pe.edu.com.sysrubricas.entity.UnidadAcademica;
@Component

public class UnidadAcademicaDaoImp implements UnidadAcademicaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(UnidadAcademica u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL PK_UNIDAD.sp_create_unidad(?,?,?)", u.getNombre(), u.getId_padre(), u.getId_tipo());
	}
	@Override
	public int update(UnidadAcademica u) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PK_UNIDAD.sp_update_unidad(?,?,?)", u.getId_unidad() , u.getNombre(), u.getId_padre() );
	}
	@Override
	public UnidadAcademica readUpdate(int id) {
		return null;
		
	}
	@Override
	public Map<String, Object> delete(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_unidad")
				.withProcedureName("sp_delete_unidad")
				.declareParameters(new SqlOutParameter("CURSOR_U", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("id", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
				return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_unidad") //nombre del paquete
				.withProcedureName("sp_listar_unidad") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CURSOR_U", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> Campus() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_unidad") //nombre del paquete
				.withProcedureName("sp_listar_campus") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CURSOR_U", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readCampus(String nom) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_unidad")
				.withProcedureName("sp_listar_fac")
				.declareParameters(new SqlOutParameter("CURSOR_U", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("nom", Types.VARCHAR));
				SqlParameterSource in = new MapSqlParameterSource().addValue("nom", nom);
				return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> traerEscuela(int id){
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_unidad")
				.withProcedureName("sp_listar_ep")
				.declareParameters(new SqlOutParameter("CURSOR_U", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idpadre", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("idpadre", id);
				return simpleJdbcCall.execute(in);
	}


}
