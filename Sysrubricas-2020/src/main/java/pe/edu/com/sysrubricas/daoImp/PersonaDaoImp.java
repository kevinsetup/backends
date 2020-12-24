package pe.edu.com.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;
import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.entity.Persona;
@Component
public class PersonaDaoImp implements PersonaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Persona p) {
		return jdbcTemplate.update("call pk_persona.sp_create_persona(?,?,?,?,?)",p.getNombres(),
				p.getApepat(),p.getApemat(),p.getDni(),p.getTelefono());
	}
	@Override
	public int update(Persona p) {
		return jdbcTemplate.update("call pk_persona.sp_update_persona(?,?,?,?,?,?)",p.getId_persona(),p.getNombres(),
				p.getApepat(),p.getApemat(),p.getDni(),p.getTelefono());
	}
	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call pk_persona.sp_delete_persona(?)", id);
	}
	@Override
	public Persona read(int id) {
		String SQL = "select * from persona where id_persona=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Persona>(Persona.class));
	}
	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_persona")
				.withProcedureName("sp_listar_persona")
				.declareParameters(new SqlOutParameter("cursor_personas", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}
		
}
