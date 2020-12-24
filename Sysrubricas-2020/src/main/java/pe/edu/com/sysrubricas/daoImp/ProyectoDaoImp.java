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
import pe.edu.com.sysrubricas.dao.ProyectoDao;
import pe.edu.com.sysrubricas.entity.Proyecto;
@Component
public class ProyectoDaoImp implements ProyectoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Proyecto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Proyecto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readxUnidad(int id) {
		System.out.println(id);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PK_PARTICIPANTE") // nombre del paquete
                .withProcedureName("SP_READUNXPY") // nombre del procedimiento
                .declareParameters(new SqlOutParameter("CURSOR_P", OracleTypes.CURSOR, new ColumnMapRowMapper()),
                        new SqlParameter("iddddddd", Types.INTEGER));
        SqlParameterSource in = new MapSqlParameterSource().addValue("P_ID", id);
        return simpleJdbcCall.execute(in);
	}

}
