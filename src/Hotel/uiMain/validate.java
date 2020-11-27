package uiMain;

import java.util.Date;
import java.util.List;
import gestorAplicacion.Hotel.*;
import gestorAplicacion.Terceros.*;

public class validate {
	private static global globalServices = new global();

	validate() {
	}

	public static boolean Guardar(List<String> data, String clase) throws Exception {
		boolean isCorrect = false;
		switch (clase) {
		case "Reserva":
			if (Cliente.clienteExist(Integer.parseInt(data.get(2)))) {
				Cliente cli = Cliente.ClientePorCedula(Integer.parseInt(data.get(2)));
				if (!cli.isPazYSalvo()) {
					throw new Exception("El Cliente tiene un pago pendiente");
				}
				Habitacion hab = Habitacion.getHabitacionPorNum(data.get(5));
				Date fechaI;
				Date fechaF;
				fechaI = globalServices.StringToDate(data.get(3));
				fechaF = globalServices.StringToDate(data.get(4));
				Reserva r = new Reserva(cli, hab, fechaI, fechaF);

				boolean alta = true;
				if (data.get(0).equals("Baja")) {
					alta = false;
				}
				Pago.crearPago(r, alta);
				cli.setReserva(r);
			} else {
				throw new Exception("El Cliente no esta registrado");
			}
			break;
		case "Habitacion":
			new Habitacion(data.get(0), data.get(1));
			break;
		case "Empleado":
			new Empleado(Integer.parseInt(data.get(1)), data.get(0), Float.parseFloat(data.get(2)));
			break;
		case "Cliente":
			new Cliente(Integer.parseInt(data.get(0)), data.get(1));
			break;
		case "EReserva":
			Reserva.eliminarReserva(Integer.parseInt(data.get(0)));
			isCorrect = true;
			break;
		case "EHabitacion":
			Habitacion.eliminarHabitacion(Integer.parseInt(data.get(0)));
			isCorrect = true;
			break;
		case "ECliente":
			Cliente c = Cliente.ClientePorCedula(Integer.parseInt(data.get(0)));
			if (c == null) {
				throw new Exception("El Cliente no existe");
			} else if (c.isPazYSalvo()) {
				Cliente.eliminarCliente(c);
				isCorrect = true;
			} else {
				throw new Exception("El Cliente tiene una deuda pendiente");
			}
			break;
		case "EEmpleado":
			Empleado e = Empleado.EmpleadoPorCedula(Integer.parseInt(data.get(0)));
			if (e == null) {
				throw new Exception("El Empleado no existe");
			} else {
				Empleado.eliminarEmpleado(e);
				isCorrect = true;
			}

			break;

		default:
			break;
		}
		globalServices.GuardarSesion();
		return isCorrect;
	}
}
