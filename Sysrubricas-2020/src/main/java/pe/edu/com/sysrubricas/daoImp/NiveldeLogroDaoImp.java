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
import pe.edu.com.sysrubricas.dao.NiveldeLogroDao;
import pe.edu.com.sysrubricas.entity.NiveldeLogro;

@Component
public class NiveldeLogroDaoImp implements NiveldeLogroDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(NiveldeLogro n) {
		return jdbcTemplate.update("CALL PK_NIVEL.SP_CREATE_N(?)", n.getNombre());
		
	}

	@Override
	public int update(NiveldeLogro n) {
		return jdbcTemplate.update("CALL PK_NIVEL.SP_UPDATE_N(?, ?)",n.getId_nivel(), n.getNombre());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("CALL PK_NIVEL.SP_DELETE_N(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_NIVEL")
		.withProcedureName("SP_READ_N")
		.declareParameters(new SqlOutParameter("cursor_nivel", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_NIVEL", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_NIVEL", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_nivel")
				.withProcedureName("sp_listar_n")
				.declareParameters(new SqlOutParameter("cursor_nivel", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
