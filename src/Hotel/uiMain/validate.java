package uiMain;

import java.util.List;
import gestorAplicacion.Hotel.*;
import gestorAplicacion.Terceros.*;

public class validate {
	private static global globalServices = new global();

	validate() {
	}

	public static boolean Guardar(List<String> data, String clase) {
		boolean isCorrect = false;
		try {
			switch (clase) {
			case "Reserva":
//				new Reserva(data.get(1), data.get(1));
				break;
			case "Habitacion":
				new Habitacion(data.get(0), data.get(1));
				break;
			case "Empleado":
				new Empleado(Integer.parseInt(data.get(0)), data.get(1), Float.parseFloat(data.get(2)));
				break;
			case "Cliente":
				new Cliente(Integer.parseInt(data.get(0)), data.get(1));
				break;

			default:
				break;
			}
			globalServices.GuardarSesion();
		} catch (Exception e) {
			isCorrect = false;
		}
		return isCorrect;
	}
}
