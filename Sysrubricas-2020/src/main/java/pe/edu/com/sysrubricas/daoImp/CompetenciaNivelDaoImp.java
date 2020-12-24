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
import pe.edu.com.sysrubricas.dao.CompetenciaNivelDao;
import pe.edu.com.sysrubricas.entity.CompetenciaNivel;
@Component
public class CompetenciaNivelDaoImp implements CompetenciaNivelDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(CompetenciaNivel cn) {
		return jdbcTemplate.update("call pk_competencia_nivel.sp_create_cn(?, ?, ?, ?)", cn.getIdcomp(), cn.getIdnivel(), cn.getSaber(), cn.getHacer());
	}

	@Override
	public int update(CompetenciaNivel cn) {
		return jdbcTemplate.update("call pk_competencia_nivel.sp_update_cn(?, ?, ?, ?, ?)", cn.getIdcomp_n(), cn.getIdcomp(), cn.getIdnivel(), cn.getSaber(), cn.getHacer());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call pk_competencia_nivel.sp_delete_cn(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_competencia_nivel")
		.withProcedureName("sp_read_cn")
		.declareParameters(new SqlOutParameter("CURSOR_CN", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDCN", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDCN", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_competencia_nivel")
				.withProcedureName("sp_listar_cn")
				.declareParameters(new SqlOutParameter("CURSOR_CN", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readAllDin(int id){
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_competencia_nivel")
		.withProcedureName("sp_listar_din")
		.declareParameters(new SqlOutParameter("CURSOR_CN", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDC", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDC", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> selector(int id){
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_competencia_nivel")
		.withProcedureName("sp_listar_xcomp")
		.declareParameters(new SqlOutParameter("CURSOR_CN", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDC", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDC", id);
		return simpleJdbcCall.execute(in);
	}

}
