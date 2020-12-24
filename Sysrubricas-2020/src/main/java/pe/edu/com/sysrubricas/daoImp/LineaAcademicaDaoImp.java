package pe.edu.com.sysrubricas.daoImp;

import java.sql.Types;
import java.util.Map;
import oracle.jdbc.internal.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.entity.LineaAcademica;
@Component
public class LineaAcademicaDaoImp implements LineaAcademicaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(LineaAcademica l) {
		return jdbcTemplate.update("call  pk_linea_academica.sp_create_l(?)", l.getNombre());
	}

	@Override
	public int update(LineaAcademica l) {
		return jdbcTemplate.update("CALL PK_LINEA_ACADEMICA.SP_UPDATE_L(?, ?)", l.getId_linea(), l.getNombre());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("CALL PK_LINEA_ACADEMICA.SP_DELETE_L(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_LINEA_ACADEMICA")
		.withProcedureName("SP_READ_L")
		.declareParameters(new SqlParameter("IDLINEA", Types.INTEGER),new SqlOutParameter("CURSOR_L", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDLINEA", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("PK_LINEA_ACADEMICA")
		.withProcedureName("SP_LISTAR_L")
		.declareParameters(new SqlOutParameter("CURSOR_L", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
