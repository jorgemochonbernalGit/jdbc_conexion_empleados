package conexion.jdbc.mapear.consulta.empleado;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import conexion.jdbc.objeto.empleado.Empleado;

public class EmpleadoConsultaMapper implements RowMapper<Empleado> {

	@Override
	public Empleado mapRow(ResultSet rs, int i) throws SQLException {
		Empleado em = new Empleado();
		em.setId(rs.getInt("id"));
		em.setNombre(rs.getString("nombre"));
		return em;
	}
}
