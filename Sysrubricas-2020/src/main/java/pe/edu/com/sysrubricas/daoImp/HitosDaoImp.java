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
import pe.edu.com.sysrubricas.dao.HitosDao;
import pe.edu.com.sysrubricas.entity.Hitos;
@Component
public class HitosDaoImp implements HitosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createHitos(Hitos h) {
		return jdbcTemplate.update("call  pk_hitos.sp_create_hitos(? , ? , ?)"
		,h.getFecha() , h.getDocumento(), h.getId_curso_proy());
	}

	@Override
	public int updateHitos(Hitos h) {
		
		return jdbcTemplate.update("call  pk_hitos.sp_update_hitos(? , ? , ? , ? )"
		,h.getId_hito() , h.getFecha() , h.getDocumento() , h.getId_curso_proy());
	}

	@Override
	public int deleteHitos(int id) {
		return jdbcTemplate.update("call pk_hitos.sp_delete_hitos(?)", id);
	}

	@Override
	public Map<String, Object> readHitos(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_hitos")
		.withProcedureName("sp_read_hitos")
		.declareParameters(new SqlParameter("id_hito", Types.INTEGER),new SqlOutParameter("cursor_hitos", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_idhitos", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllHitos() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_hitos")
				.withProcedureName("sp_listar_hitos")
				.declareParameters(new SqlOutParameter("cursor_hitos", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
