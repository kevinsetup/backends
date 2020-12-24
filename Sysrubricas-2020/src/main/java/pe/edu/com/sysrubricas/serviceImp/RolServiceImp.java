package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.RolDao;
import pe.edu.com.sysrubricas.entity.Rol;
import pe.edu.com.sysrubricas.service.RolService;
@Service
public class RolServiceImp implements RolService{
		@Autowired
		private RolDao rdao;

		@Override
		public int create(Rol r) {
			return rdao.create(r);
		}

		@Override
		public int update(Rol r) {
			return rdao.update(r);
		}

		@Override
		public Map<String, Object> read(int id) {
			return rdao.read(id);
		}

		@Override
		public Map<String, Object> readAll() {
			return rdao.readAll();
		}

		@Override
		public int delete(int id) {
			return rdao.delete(id);
		}
}
