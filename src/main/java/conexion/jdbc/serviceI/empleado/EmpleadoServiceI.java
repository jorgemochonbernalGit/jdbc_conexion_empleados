package conexion.jdbc.serviceI.empleado;

import java.util.List;

import conexion.jdbc.objeto.empleado.Empleado;

public interface EmpleadoServiceI {
	List<Empleado> getEmpleados();
	Empleado getEmpleado(int id);
	Empleado newEmpleado(Empleado empleado);
	Empleado update(Empleado empleado);
	Empleado deleteEmpleado(Empleado id);
}
