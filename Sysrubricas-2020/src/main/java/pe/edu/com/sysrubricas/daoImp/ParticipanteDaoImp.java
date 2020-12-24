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
import oracle.jdbc.OracleTypes;
import pe.edu.com.sysrubricas.dao.ParticipanteDao;
import pe.edu.com.sysrubricas.entity.Participante;

@Component
public class ParticipanteDaoImp implements ParticipanteDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Participante p) {
		
		return jdbcTemplate.update("CALL PK_PARTICIPANTE.SP_CREATE_P(?,?,?)" , p.getId_persona() , p.getId_proyecto() , p.getTipo()) ;
	}

	@Override
	public int update(Participante l) {
		return jdbcTemplate.update("CALL PK_PARTICIPANTE.SP_UPDATE_P(?,?,?,?)" , l.getId_persona() , l.getId_proyecto() , l.getTipo() , l.getId_participante());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL PK_PARTICIPANTE.SP_DELETE_P(?)" , id);
	}

	@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PK_PARTICIPANTE")
				 .withProcedureName("SP_READ_P")
	                .declareParameters(new SqlOutParameter("CURSOR_P", OracleTypes.CURSOR, new ColumnMapRowMapper()),
	                		new SqlParameter("iddddddd", Types.INTEGER));
        SqlParameterSource in = new MapSqlParameterSource().addValue("P_ID", id);
        return simpleJdbcCall.execute(in);	
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_PARTICIPANTE")
				.withProcedureName("SP_LISTAR_P")
				.declareParameters(new SqlOutParameter("CURSOR_P" , OracleTypes.CURSOR , new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	
}
