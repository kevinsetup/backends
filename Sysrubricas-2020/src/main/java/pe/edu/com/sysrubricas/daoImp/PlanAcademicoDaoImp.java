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
import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.entity.PlanAcademico;
@Component
public class PlanAcademicoDaoImp implements PlanAcademicoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(PlanAcademico p) {
		return jdbcTemplate.update("call pk_plan_academica.sp_create_p(?, ?, ?, ?, ?, ?, ?)", p.getNombre(),
				p.getIdunidad(), p.getCiclos(), p.getCursos(), p.getCreditos(), p.getAnio_inicio(), p.getAnio_termino());
	}

	@Override
	public int update(PlanAcademico p) {
		return jdbcTemplate.update("call PK_PLAN_ACADEMICA.SP_UPDATE_P(?, ?, ?, ?, ?, ?, ?, ?)", p.getIdplan(),p.getNombre(),
				p.getIdunidad(), p.getCiclos(), p.getCursos(), p.getCreditos(), p.getAnio_inicio(), p.getAnio_termino()) ;
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call pk_plan_academica.sp_delete_p(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_PLAN_ACADEMICA")
		.withProcedureName("SP_READ_P")
		.declareParameters(new SqlOutParameter("CURSOR_P", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDP", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDP", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_plan_academica")
				.withProcedureName("sp_listar_p")
				.declareParameters(new SqlOutParameter("CURSOR_P", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readxUnidad(int id){
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_PLAN_ACADEMICA")
		.withProcedureName("SP_LISTAR_XUNIDAD")
		.declareParameters(new SqlOutParameter("CURSOR_P", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDU", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDU", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readPlanforSelector(int id){
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_PLAN_ACADEMICA")
		.withProcedureName("SP_TRAER_P_SELECT")
		.declareParameters(new SqlOutParameter("CURSOR_P", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDU", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDU", id);
		return simpleJdbcCall.execute(in);
	}
}