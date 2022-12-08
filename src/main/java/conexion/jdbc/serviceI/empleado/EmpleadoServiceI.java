package conexion.jdbc.serviceI.empleado;

import java.util.List;

import conexion.jdbc.objeto.empleado.Empleado;

public interface EmpleadoServiceI {
	List<Empleado> getEmpleados();
	Empleado getEmpleado(int id);
	int newEmpleado(Empleado empleado);
	int update(Empleado empleado);
	int deleteEmpleado(int id);
}
