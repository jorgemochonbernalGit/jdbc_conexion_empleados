package conexion.jdbc.daoI.empleado;

import java.util.List;

import conexion.jdbc.objeto.empleado.Empleado;

public interface EmpleadoDAOI {
	List<Empleado> getEmpleados();
	Empleado getEmpleado(int id);
	int newEmpleado(Empleado empleado);
	int update(Empleado empleado);
	int deleteEmpleado(int id);
}
