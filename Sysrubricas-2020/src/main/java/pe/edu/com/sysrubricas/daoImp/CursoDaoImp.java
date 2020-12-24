package pe.edu.com.sysrubricas.daoImp;

import java.util.Map;

import pe.edu.com.sysrubricas.dao.CursoDao;
import pe.edu.com.sysrubricas.entity.Curso;

import java.sql.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import oracle.jdbc.OracleTypes;
@Component
public class CursoDaoImp implements CursoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Curso c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL PK_CURSO.SP_CREATE_C(?)" , c.getNombre());	}

	@Override
	public int update(Curso c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL PK_CURSO.SP_UPDATE_C(?,?)" , c.getIdcurso() , c.getNombre());
	}

	@Override
	public int delete(int c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL PK_CURSO.SP_DELETE_C(?)" , c);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PK_CURSO") // nombre del paquete
                .withProcedureName("SP_READ_C") // nombre del procedimiento
                .declareParameters(new SqlOutParameter("CURSOR_C", OracleTypes.CURSOR, new ColumnMapRowMapper()),
                        new SqlParameter("iddddddd", Types.INTEGER));
        SqlParameterSource in = new MapSqlParameterSource().addValue("IDCURSO", id);
        return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_CURSO")
				.withProcedureName("SP_LISTAR_C")
				.declareParameters(new SqlOutParameter("CURSOR_C" , OracleTypes.CURSOR , new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();	}

}
