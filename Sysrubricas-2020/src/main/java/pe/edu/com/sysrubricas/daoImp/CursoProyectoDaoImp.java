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
import pe.edu.com.sysrubricas.dao.CursoProyectoDao;
import pe.edu.com.sysrubricas.entity.CursoProyecto;
@Component
public class CursoProyectoDaoImp implements CursoProyectoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createCursoProyecto(CursoProyecto cp) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pk_curso_proy.sp_create_curso_proyecto(? , ?)"
	,cp.getId_proyecto(), cp.getId_carga());
	}

	@Override
	public int updateCursoProyecto(CursoProyecto cp) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pk_curso_proy.sp_update_curso_proyecto(?, ? , ?)"
, cp.getId_curso_proy() ,cp.getId_proyecto() , cp.getId_carga());
	}

	@Override
	public int deleteCursoProyecto(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_curso_proy.sp_delete_curso_proyecto(?)", id);
	}

	@Override
	public Map<String, Object> readCursoProyecto(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_curso_proy")
		.withProcedureName("sp_read_curso_proyecto")
		.declareParameters(new SqlParameter("id_persona", Types.INTEGER),new SqlOutParameter("cursor_curso_proy", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_idcursoproy", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllCursoProyecto() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_curso_proy")
				.withProcedureName("sp_listar_curso_proyecto")
				.declareParameters(new SqlOutParameter("cursor_curso_proy", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
