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
import pe.edu.com.sysrubricas.dao.CompetenciaDao;
import pe.edu.com.sysrubricas.entity.Competencia;


@Component
public class CompetenciaDaoImp implements CompetenciaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Competencia comp) {
		return jdbcTemplate.update("CALL PK_COMPETENCIA.SP_CREATE_C(?,?,?,?)", comp.getNombre(),comp.getIdplan_l(),comp.getDescripcion(),comp.getTipo());
	}

	@Override
	public int update(Competencia comp) {
		return jdbcTemplate.update("CALL PK_COMPETENCIA.SP_UPDATE_C(?,?,?,?,?)",comp.getIdcomp(), comp.getNombre(),comp.getIdplan_l(),comp.getDescripcion(),comp.getTipo());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("CALL PK_COMPETENCIA.SP_DELETE_C(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_COMPETENCIA")
		.withProcedureName("SP_READ_C")
		.declareParameters(new SqlOutParameter("CURSOR_C", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_C", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDC", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_COMPETENCIA")
				.withProcedureName("SP_LISTAR_C")
				.declareParameters(new SqlOutParameter("CURSOR_C", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readxPlan_l(int id){
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_COMPETENCIA")
		.withProcedureName("SP_READ_C_XIDPLANL")
		.declareParameters(new SqlOutParameter("CURSOR_C", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDPL", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDPL", id);
		return simpleJdbcCall.execute(in);
	}

}
