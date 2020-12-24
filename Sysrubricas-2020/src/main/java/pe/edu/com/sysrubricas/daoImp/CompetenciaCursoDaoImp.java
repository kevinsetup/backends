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
import pe.edu.com.sysrubricas.dao.CompetenciaCursoDao;
import pe.edu.com.sysrubricas.entity.CompetenciaCurso;
@Component
public class CompetenciaCursoDaoImp implements CompetenciaCursoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(CompetenciaCurso cc) {
		return jdbcTemplate.update("call pk_competencia_curso.sp_create_cc(?, ?)", cc.getId_curso_plan(), cc.getIdcomp_n());
	}

	@Override
	public int update(CompetenciaCurso cc) {
		return jdbcTemplate.update("call pk_competencia_curso.sp_update_cc(?, ?)", cc.getIdcomp_c() ,cc.getId_curso_plan(), cc.getIdcomp_n());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call pk_competencia_curso.sp_delete_cc(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_competencia_curso")
		.withProcedureName("sp_read_cc")
		.declareParameters(new SqlOutParameter("CURSOR_CC", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDC", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDC", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readDinamic(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_competencia_curso")
		.withProcedureName("sp_listar_din")
		.declareParameters(new SqlOutParameter("CURSOR_CC", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDCN", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDCN", id);
		return simpleJdbcCall.execute(in);
	}

}
