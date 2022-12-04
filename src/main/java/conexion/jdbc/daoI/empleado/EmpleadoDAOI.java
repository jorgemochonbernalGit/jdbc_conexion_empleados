package conexion.jdbc.daoI.empleado;

import java.util.List;

import conexion.jdbc.objeto.empleado.Empleado;

public interface EmpleadoDAOI {
	List<Empleado> getEmpleados();
	Empleado getEmpleado(int id);
	Empleado newEmpleado(Empleado empleado);
	Empleado update(Empleado empleado);
	Empleado deleteEmpleado(Empleado id);
}
