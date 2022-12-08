package conexion.jdbc.controller.empleado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import conexion.jdbc.objeto.empleado.Empleado;
import conexion.jdbc.service.empleado.EmpleadoService;

@RestController
@RequestMapping(path = "/consultoria")
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<Empleado> empleados() {
		return empleadoService.getEmpleados();
	}

	@GetMapping("/empleados/{id}")
	public Empleado empleado(@PathVariable(value="id") int id) {
		return empleadoService.getEmpleado(id);
	}
	
	@PostMapping("/empleado")
	public int newEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.newEmpleado(empleado);
	}
	
	@PutMapping("/empleado/{id}")
	public int updateEmpleado(@RequestBody Empleado empleado,@PathVariable(value="id") int id) {
		empleado.setId(id);
		return empleadoService.update(empleado);
	}
	
	@DeleteMapping("/empleado/{id}")
	public int deleteEmpleado(@PathVariable(value="id") int id) {
		return empleadoService.deleteEmpleado(id);
	}
}
