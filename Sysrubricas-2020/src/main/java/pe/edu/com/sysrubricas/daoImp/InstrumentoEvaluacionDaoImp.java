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
import pe.edu.com.sysrubricas.dao.InstrumentoEvaluacionDao;
import pe.edu.com.sysrubricas.entity.InstrumentoEvaluacion;
@Component
public class InstrumentoEvaluacionDaoImp implements InstrumentoEvaluacionDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createInsturentoEvaluacion(InstrumentoEvaluacion ins) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pkg_ins_evaluacion.sp_create_ins_evaluacion(? , ? , ? , ? ,? )"
	,ins.getId_metodologia() , ins.getNombre() , ins.getPorcentaje() , ins.getObservacion() , ins.getValidacion());
	}

	@Override
	public int updateInsturentoEvaluacion(InstrumentoEvaluacion ins) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pkg_ins_evaluacion.sp_update_ins_evaluacion(? , ? , ? , ? ,? , ?)"
	,ins.getId_instrumento() , ins.getId_metodologia() , ins.getNombre() , ins.getPorcentaje() , ins.getObservacion() ,ins.getValidacion());
	}

	@Override
	public int deleteInsturentoEvaluacion(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_ins_evaluacion.sp_delete_ins_evaluacion(?)", id);
	}

	@Override
	public Map<String, Object> readInsturentoEvaluacion(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pkg_ins_evaluacion")
		.withProcedureName("sp_read_ins_evaluacion")
		.declareParameters(new SqlParameter("id_instrumento", Types.INTEGER),new SqlOutParameter("cursor_ins_evaluacion", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_inst_eva", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllInsturentoEvaluacion() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("sp_listar_ins_evaluacion")
				.withProcedureName("sp_listar_persona")
				.declareParameters(new SqlOutParameter("cursor_ins_evaluacion", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
