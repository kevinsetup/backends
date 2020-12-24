package pe.edu.com.sysrubricas.daoImp;

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

import oracle.jdbc.OracleTypes;
import pe.edu.com.sysrubricas.dao.ModuloDao;
import pe.edu.com.sysrubricas.entity.Modulo;
@Component
public class ModuloDaoImp implements ModuloDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Modulo m) {
		return jdbcTemplate.update("call pk_modulo.sp_create_modulo(?)",m.getNombremod());
	}

	@Override
	public int update(Modulo m) {
		return jdbcTemplate.update("call pk_modulo.sp_update_modulo(?,?)",m.getIdmodulo(),m.getNombremod());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call pk_modulo.sp_delete_modulo(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)			
				.withCatalogName("pk_modulo") //nombre del paquete
				.withProcedureName("sp_listar_modulo") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("cursor_modulos", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()), new SqlParameter("idmod", OracleTypes.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("idmod", id);
		        Map<String, Object> map= simpleJdbcCall.execute(in);	
				return map;	
		}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_modulo")
				.withProcedureName("sp_listar_modulo")
				.declareParameters(new SqlOutParameter("cursor_modulos", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
