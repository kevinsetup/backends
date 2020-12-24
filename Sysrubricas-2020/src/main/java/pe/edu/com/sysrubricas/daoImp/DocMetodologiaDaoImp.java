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
import pe.edu.com.sysrubricas.dao.DocMetodologiaDao;
import pe.edu.com.sysrubricas.entity.DocMetodologia;
@Component
public class DocMetodologiaDaoImp implements DocMetodologiaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createDocMetodologia(DocMetodologia dm) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call  pk_doc_metodo.sp_create_doc_metodo(? , ? , ?)"
		,dm.getId_unidad(), dm.getId_semestre() ,dm.getDocumento());
	}

	@Override
	public int updateDocMetodologia(DocMetodologia dm) {
		// TODO Auto-generated method stub
	return jdbcTemplate.update("call  pk_doc_metodo.sp_update_doc_metodo(?, ? , ? , ?)"
	,dm.getId_metodologia() , dm.getId_unidad() , dm.getId_semestre() , dm.getDocumento());
	}

	@Override
	public int deleteMetodologia(int id) {
		// TODO Auto-generated method stub
	return jdbcTemplate.update("call  pk_doc_metodo.sp_delete_doc_metodo(?)",id);
	}

	@Override
	public Map<String, Object> readMetodologia(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("pk_doc_metodo")
		.withProcedureName("sp_read_doc_metodo")
		.declareParameters(new SqlParameter("id_metodologia", Types.INTEGER),new SqlOutParameter("cursor_metodologia", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_idmetodo", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllMetodologia() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_doc_metodo")
				.withProcedureName("sp_listar_doc_metodo")
				.declareParameters(new SqlOutParameter("cursor_metodologia", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
