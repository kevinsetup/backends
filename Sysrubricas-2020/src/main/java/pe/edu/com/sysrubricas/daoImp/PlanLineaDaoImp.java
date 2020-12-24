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
import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.entity.PlanLinea;
@Component
public class PlanLineaDaoImp implements PlanLineaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(PlanLinea pl) {
		return jdbcTemplate.update("call pk_plan_linea.sp_create_pl(?, ?)", pl.getIdplan(), pl.getIdlinea());
	}

	@Override
	public int update(PlanLinea pl) {
		return jdbcTemplate.update("call pk_plan_linea.sp_update_pl(?, ?, ?)", pl.getIdplan_l(), pl.getIdplan(), pl.getIdlinea());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call pk_plan_linea.sp_delete_pl(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_plan_linea")
		.withProcedureName("sp_read_pl")
		.declareParameters(new SqlOutParameter("cursor_pl", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDPL", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDPL", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_plan_linea")
		.withProcedureName("sp_listar_pl")
		.declareParameters(new SqlOutParameter("cursor_pl", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> readAllDin(){
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_plan_linea")
				.withProcedureName("sp_listdinamico_pl")
				.declareParameters(new SqlOutParameter("cursor_pl", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> lineasxPlan(int id){
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_plan_linea")
		.withProcedureName("sp_traerlineasxplan")
		.declareParameters(new SqlOutParameter("CURSOR_PL", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDP", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDP", id);
		return simpleJdbcCall.execute(in);
	}
}
