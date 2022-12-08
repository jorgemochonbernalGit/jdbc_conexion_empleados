package conexion.jdbc.service.empleado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import conexion.jdbc.dao.epmpleado.EmpleadoDAO;
import conexion.jdbc.objeto.empleado.Empleado;
import conexion.jdbc.serviceI.empleado.EmpleadoServiceI;

@Repository
public class EmpleadoService implements EmpleadoServiceI {
	@Autowired
	EmpleadoDAO empleadoDAO;

	@Override
	public List<Empleado> getEmpleados() {
		return empleadoDAO.getEmpleados();
	}

	@Override
	public Empleado getEmpleado(int id) {
		return empleadoDAO.getEmpleado(id);
	}

	@Override
	public int newEmpleado(Empleado empleado) {
		return empleadoDAO.newEmpleado(empleado);
	}

	@Override
	public int update(Empleado empleado) {
		return empleadoDAO.update(empleado);
	}

	@Override
	public int deleteEmpleado(int id) {
		return empleadoDAO.deleteEmpleado(id);
	}

}
