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
import pe.edu.com.sysrubricas.dao.Curso_planDao;
import pe.edu.com.sysrubricas.entity.Curso_plan;
@Component
public class Curso_planDaoImp implements Curso_planDao {
@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Curso_plan cp) {
		return jdbcTemplate.update( "call pk_curso_plan.sp_create_cp(?,?,?,?,?)" , cp.getId_curso() , cp.getId_plan(), cp.getCreditos() , cp.getHoras() , cp.getCiclo());
	}

	@Override
	public int update(Curso_plan c) {
		return jdbcTemplate.update("call pk_curso_plan.sp_update_cp(?,?,?,?,?,?)" , c.getId_curso_plan() , c.getId_curso() , c.getId_plan() , c.getCreditos() , c.getHoras() , c.getCiclo());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_curso_plan.sp_delete_cp(?)" , id);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_CURSO_PLAN")
				.withProcedureName("SP_LISTAR_CP")
				.declareParameters(new SqlOutParameter("CURSOR_CP",  OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PK_CURSO_PLAN") // nombre del paquete
                .withProcedureName("SP_READ_CP") // nombre del procedimiento
                .declareParameters(new SqlOutParameter("CURSOR_CP", OracleTypes.CURSOR, new ColumnMapRowMapper()),
                        new SqlParameter("iddddddd", Types.INTEGER));
        SqlParameterSource in = new MapSqlParameterSource().addValue("IDCURSOPLAN", id);
        return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readcpp(int id) {
		System.out.println(id);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PK_CURSO_PLAN") // nombre del paquete
                .withProcedureName("SP_LISTAR_CPP") // nombre del procedimiento
                .declareParameters(new SqlOutParameter("CURSOR_CPP", OracleTypes.CURSOR, new ColumnMapRowMapper()),
                        new SqlParameter("iddddddd", Types.INTEGER));
        SqlParameterSource in = new MapSqlParameterSource().addValue("IDP", id);
        return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readxPlan(int id){
		System.out.println(id);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PK_CURSO_PLAN") // nombre del paquete
                .withProcedureName("SP_LISTAR_XPLAN") // nombre del procedimiento
                .declareParameters(new SqlOutParameter("CURSOR_CP", OracleTypes.CURSOR, new ColumnMapRowMapper()),
                        new SqlParameter("IDP", Types.INTEGER));
        SqlParameterSource in = new MapSqlParameterSource().addValue("IDP", id);
        return simpleJdbcCall.execute(in);
	}
}
