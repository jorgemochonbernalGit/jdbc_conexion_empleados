package conexion.jdbc.dao.epmpleado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import conexion.jdbc.daoI.empleado.EmpleadoDAOI;
import conexion.jdbc.mapear.consulta.empleado.EmpleadoConsultaMapper;
import conexion.jdbc.objeto.empleado.Empleado;

@Repository
public class EmpleadoDAO implements EmpleadoDAOI {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Empleado> getEmpleados() {
		String sql = "SELECT * FROM EMPLEADOS";
		List<Empleado> empleados = new ArrayList<>();
		empleados.addAll(jdbcTemplate.query(sql, new BeanPropertyRowMapper<Empleado>(Empleado.class)));
		return empleados;
	}

	@Override
	public Empleado getEmpleado(int id) {
		String sql = "SELECT * FROM EMPLEADOS WHERE ID = ?";
		Empleado empleado;
		empleado = (Empleado) jdbcTemplate.queryForObject(sql, new EmpleadoConsultaMapper(), id);
		return empleado;
	}

	@Override
	public int newEmpleado(Empleado empleado) {
		String sql = "INSERT INTO EMPLEADOS (nombre) VALUES (?)";
		return jdbcTemplate.update(sql, empleado.getNombre());
	}

	@Override
	public int update(Empleado empleado) {
		String sql = "UPDATE EMPLEADOS SET nombre = ? WHERE id = ?";
		return jdbcTemplate.update(sql,empleado.getNombre(),empleado.getId());
	}

	@Override
	public int deleteEmpleado(int id) {
		String sql = "DELETE FROM EMPLEADOS WHERE ID = ?";
		return jdbcTemplate.update(sql, id);
	}

}
