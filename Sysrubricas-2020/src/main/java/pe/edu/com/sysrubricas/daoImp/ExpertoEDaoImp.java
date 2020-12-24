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
import pe.edu.com.sysrubricas.dao.ExpertoEDao;
import pe.edu.com.sysrubricas.entity.ExpertoE;
@Component
public class ExpertoEDaoImp implements ExpertoEDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(ExpertoE e) {
		return jdbcTemplate.update("CALL PK_EXPERTOE.SP_CREATE_EX(?)", e.getIdpersona());
			}

	@Override
	public int update(ExpertoE e) {
		return jdbcTemplate.update("CALL PK_EXPERTOE.SP_UPDATE_EX(?,?)", e.getIdexpertoe(),e.getIdpersona());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("CALL PK_EXPERTOE.SP_DELETE_EX(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_EXPERTOE")
		.withProcedureName("sp_read_ex")
		.declareParameters(new SqlOutParameter("cursor_experto", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDEX", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDEX", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_EXPERTOE")
				.withProcedureName("sp_listar_ex")
				.declareParameters(new SqlOutParameter("cursor_experto", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
