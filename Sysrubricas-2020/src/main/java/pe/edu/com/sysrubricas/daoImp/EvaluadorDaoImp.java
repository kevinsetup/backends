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
import pe.edu.com.sysrubricas.dao.EvaluadorDao;
import pe.edu.com.sysrubricas.entity.Evaluador;
@Component
public class EvaluadorDaoImp implements EvaluadorDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createEvaluador(Evaluador ev) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pkg_evaluador.sp_create_evaluador(? , ? , ?)"
,ev.getId_persona(), ev.getId_proyecto() , ev.getTipo());
	}
	@Override
	public int updateEvaluador(Evaluador ev) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_evaluador.sp_update_evaluador(? , ? , ? , ?)"
, ev.getIdevaluador() , ev.getId_persona() , ev.getId_proyecto() , ev.getTipo());
	}
	@Override
	public int deleteEvaluador(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL pkg_evaluador.sp_delete_evaluador(?)", id);
	}
	@Override
	public Map<String, Object> readEvaluador(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pkg_evaluador")
		.withProcedureName("sp_read_evaluador")
		.declareParameters(new SqlParameter("idevaluador", Types.INTEGER),new SqlOutParameter("cursor_evaluadores", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_ideval", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAllEvaluador() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_evaluador")
				.withProcedureName("sp_listar_evaluadores")
				.declareParameters(new SqlOutParameter("cursor_evaluadores", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
	

	

}
