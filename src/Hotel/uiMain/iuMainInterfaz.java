/*Esta clase se encarga de manejar las acciones y todo lo relacionado a la interfaz de menus superior, junto con los saltos de vistas hacia los paneles de formularios*/
package uiMain;

import java.util.ArrayList;
import java.util.List;

import gestorAplicacion.Hotel.Habitacion;
import gestorAplicacion.Hotel.Pago;
import gestorAplicacion.Hotel.Reserva;
import gestorAplicacion.Terceros.Cliente;
import gestorAplicacion.Terceros.Empleado;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class iuMainInterfaz {

	Stage panelito = new Stage();
	BorderPane root = new BorderPane();
	GridPane panel2 = new GridPane();

	MenuItem menuItem1 = new MenuItem("Crear Reserva"); // listo
	MenuItem menuItem2 = new MenuItem("Buscar Reserva");
	MenuItem menuItem3 = new MenuItem("Eliminar Reserva"); // Listo
	MenuItem menuItem4 = new MenuItem("Cancelar Reserva");
	MenuItem menuItem5 = new MenuItem("Mostrar Listado de Reserva"); // listo
	MenuItem menuItem6 = new MenuItem("Verificacion de disponibilidad de habitacion por tipo");
	MenuItem menuItem7 = new MenuItem("Asignar Habitacion al Cliente");
	MenuItem menuItem8 = new MenuItem("Mostrar Habitacion Disponible");
	MenuItem menuItem9 = new MenuItem("Crear Habitacion"); // listo
	MenuItem menuItem10 = new MenuItem("Buscar Habitacion"); // listo
	MenuItem menuItem11 = new MenuItem("Editar Habitacion");
	MenuItem menuItem12 = new MenuItem("Eliminar Habitacion"); // Listo
	MenuItem menuItem13 = new MenuItem("Mostrar Listado de Habitaciones"); // listo
	MenuItem menuItem14 = new MenuItem("Verificar Disponibilidad");
	MenuItem menuItem15 = new MenuItem("Pagar Factura");
	MenuItem menuItem16 = new MenuItem("Mostrar Pago Pendiente");
	MenuItem menuItem17 = new MenuItem("Informacion Caja"); // listo
	MenuItem menuItem18 = new MenuItem("Pagar Empleados (Nomina)");
	MenuItem menuItem19 = new MenuItem("Crear Cliente"); // listo
	MenuItem menuItem20 = new MenuItem("Buscar Cliente");// listo
	MenuItem menuItem21 = new MenuItem("Editar Cliente");
	MenuItem menuItem22 = new MenuItem("Eliminar Cliente"); // Listo
	MenuItem menuItem23 = new MenuItem("Mostrar Listado Cliente"); // listo
	MenuItem menuItem24 = new MenuItem("Crear Empleado"); // listo
	MenuItem menuItem25 = new MenuItem("Buscar Empleado");// listo
	MenuItem menuItem26 = new MenuItem("Editar Empleado");
	MenuItem menuItem27 = new MenuItem("Eliminar Empleado"); // Listo
	MenuItem menuItem28 = new MenuItem("Dar Informacion");
	MenuItem menuItem29 = new MenuItem("Mostrar Listado de Empleados"); // listo
	MenuItem menuItem30 = new MenuItem("Informacion Hotel"); // listo

	MenuItem acerca;
	MenuItem salir;
	MenuItem hpoo;
	Label cajapanel2 = new Label();

	public void crearEscenaMenu() {

		root.setPadding(new Insets(10, 10, 10, 10));

		MenuBar barraMenu = new MenuBar();

		Menu menu1 = new Menu("Archivo");
		Menu menu2 = new Menu("Procesos y Consultas");
		Menu menu3 = new Menu("Ayuda");
		Menu menu4 = new Menu("Reserva");
		Menu menu5 = new Menu("Check-in");
		Menu menu6 = new Menu("Habitaciones");
		Menu menu7 = new Menu("Pagos");
		Menu menu8 = new Menu("Clientes");
		Menu menu9 = new Menu("Empleados");

		acerca = new MenuItem("Acerca de");
		salir = new MenuItem("Salir");
		hpoo = new MenuItem("Hotel POOderoso");

		menu1.getItems().addAll(hpoo);
		menu1.getItems().addAll(salir);
		menu2.getItems().addAll(menu4);
		menu4.getItems().addAll(menuItem1);
		menu4.getItems().addAll(menuItem2);
		menu4.getItems().addAll(menuItem3);
		menu4.getItems().addAll(menuItem4);
		menu4.getItems().addAll(menuItem5);
		menu2.getItems().addAll(menu5);
		menu5.getItems().addAll(menuItem6);
		menu5.getItems().addAll(menuItem7);
		menu5.getItems().addAll(menuItem8);
		menu2.getItems().addAll(menu6);
		menu6.getItems().addAll(menuItem9);
		menu6.getItems().addAll(menuItem10);
		menu6.getItems().addAll(menuItem11);
		menu6.getItems().addAll(menuItem12);
		menu6.getItems().addAll(menuItem13);
		menu6.getItems().addAll(menuItem14);
		menu2.getItems().addAll(menu7);
		menu7.getItems().addAll(menuItem15);
		menu7.getItems().addAll(menuItem16);
		menu7.getItems().addAll(menuItem17);
		menu7.getItems().addAll(menuItem18);
		menu2.getItems().addAll(menu8);
		menu8.getItems().addAll(menuItem19);
		menu8.getItems().addAll(menuItem20);
		menu8.getItems().addAll(menuItem21);
		menu8.getItems().addAll(menuItem22);
		menu8.getItems().addAll(menuItem23);
		menu2.getItems().addAll(menu9);
		menu9.getItems().addAll(menuItem24);
		menu9.getItems().addAll(menuItem25);
		menu9.getItems().addAll(menuItem26);
		menu9.getItems().addAll(menuItem27);
		menu9.getItems().addAll(menuItem28);
		menu9.getItems().addAll(menuItem29);
		menu2.getItems().addAll(menuItem30);
		menu3.getItems().addAll(acerca);

		UnicoHandlerClass handler = new UnicoHandlerClass();
		acerca.setOnAction(handler);
		hpoo.setOnAction(handler);
		salir.setOnAction(handler);
		menuItem1.setOnAction(handler);
		menuItem2.setOnAction(handler);
		menuItem3.setOnAction(handler);
		menuItem4.setOnAction(handler);
		menuItem5.setOnAction(handler);
		menuItem6.setOnAction(handler);
		menuItem7.setOnAction(handler);
		menuItem8.setOnAction(handler);
		menuItem9.setOnAction(handler);
		menuItem10.setOnAction(handler);
		menuItem11.setOnAction(handler);
		menuItem12.setOnAction(handler);
		menuItem13.setOnAction(handler);
		menuItem14.setOnAction(handler);
		menuItem15.setOnAction(handler);
		menuItem16.setOnAction(handler);
		menuItem17.setOnAction(handler);
		menuItem18.setOnAction(handler);
		menuItem19.setOnAction(handler);
		menuItem20.setOnAction(handler);
		menuItem21.setOnAction(handler);
		menuItem22.setOnAction(handler);
		menuItem23.setOnAction(handler);
		menuItem24.setOnAction(handler);
		menuItem25.setOnAction(handler);
		menuItem26.setOnAction(handler);
		menuItem27.setOnAction(handler);
		menuItem28.setOnAction(handler);
		menuItem29.setOnAction(handler);
		menuItem30.setOnAction(handler);

		barraMenu.getMenus().add(menu1);
		barraMenu.getMenus().add(menu2);
		barraMenu.getMenus().add(menu3);
		root.setTop(new VBox(barraMenu));

		panel2.setAlignment(Pos.CENTER);
		root.setCenter(panel2);
//		Label cajapanel = new Label("inicio");
//		panel2.add(cajapanel, 0, 0);

		panelito.setTitle("Hotel POOderoso");
		Scene mySceneMenu = new Scene(root, 750, 650);
		panelito.setScene(mySceneMenu);
		panelito.show();

	}

	class UnicoHandlerClass implements EventHandler<ActionEvent> { //Clase encargada de cargar los formularios de los usuarios dependiendo de la cantidad de datos que deban ingresar
		@Override
		public void handle(ActionEvent e) {
			Object control = e.getSource();
			if (control instanceof MenuItem) {
				if (control.equals(acerca)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					cajapanel2.setText(" Nombre:  Edwar Jose Londono Correa\n   -Correo: elondonoc@unal.edu.co\n"
							+ "\nNombre: Sebastian Rendon Arteaga\n   -Correo: serendona@unal.edu.co\n"
							+ "\nNombre: Diego Andres Chavarria Riano\n   -Correo: dchavarriar@unal.edu.co\n"
							+ "\nNombre: Andres Castrillon Velasquez\n   -Correo: acastrillonv@unal.edu.co");
					cajapanel2.setFont(new Font("Arial", 30));
					panel2.add(cajapanel2, 0, 0);
				} else if (control.equals(hpoo)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					Label h = new Label("Hotel POOderoso");
					h.setFont(new Font("Arial", 50));
					panel2.add(h, 0, 0);

				} else if (control.equals(menuItem1)) {
					boolean lista[] = { false, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(String.valueOf(Reserva.getNumReserva() + 1));
					lista2.add(null);
					lista2.add("fecha");
					lista2.add("fecha");
					lista2.add("temporada");
					List<String> lista3 = new ArrayList<>();
					lista3.add("Numero de Reserva");
					lista3.add("Cedula Del Cliente");
					lista3.add("Fecha Inicio");
					lista3.add("Fecha Fin");
					lista3.add("Temporada");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Crear Reserva", "Se crea reserva", "Reserva");

				} else if (control.equals(menuItem2)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Numero de Reserva");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Busquedad de Reserva", "Se busca la reserva", "BReserva");

				} else if (control.equals(menuItem3)) {
					boolean lista[] = { true, false, false, false, false, false, false, false };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Numero Reserva");
					panel2 = new FieldPanel("Criterio", lista3, "Valor", lista2, lista).crearFormulario(panel2,
							"Eliminar Reserva", "Eliminando Reserva", "EReserva");
				} else if (control.equals(menuItem4)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					panel2.add(new Label("iio"), 0, 0);

				} else if (control.equals(menuItem5)) {
					panel2 = Reserva.mostarReservasExistente(panel2);

				} else if (control.equals(menuItem6)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);

					panel2.add(new Label("ini"), 0, 0);
				} else if (control.equals(menuItem7)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					panel2.add(new Label("inici"), 0, 0);

				} else if (control.equals(menuItem8)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add("fecha");
					List<String> lista3 = new ArrayList<>();
					lista3.add("Fecha Fin");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Busquedad de Habitaciones Disp",
							"Se busca habitaciones  para el Dia de hoy", "3check-in");

				} else if (control.equals(menuItem9)) {
					boolean lista[] = { false, true, false, false, false, false, false, false };
					List<String> lista2 = new ArrayList<>();
					lista2.add("tipoHabitacion");
					lista2.add("");
					List<String> lista3 = new ArrayList<>();
					lista3.add("Tipo");
					lista3.add("Descripci�n");
					panel2 = new FieldPanel("Criterio", lista3, "Valor", lista2, lista).crearFormulario(panel2,
							"Crear Habitaci�n", "Creando nueva habitaci�n", "Habitacion");
				} else if (control.equals(menuItem10)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Numero de Habitacion");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Busquedad de Habitacion", "Se busca la habitacion", "bhabi");
				} else if (control.equals(menuItem12)) {
					boolean lista[] = { true, false, false, false, false, false, false, false };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Numero Habitacion");
					panel2 = new FieldPanel("Criterio", lista3, "Valor", lista2, lista).crearFormulario(panel2,
							"Eliminar Habitacion", "Eliminando habitacion", "EHabitacion");
				} else if (control.equals(menuItem13)) {
					panel2 = Habitacion.mostrarHabitacionesExistente(panel2);

				} else if (control.equals(menuItem17)) {
					panel2 = Pago.caja(panel2);

				} else if (control.equals(menuItem19)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Cedula");
					lista3.add("Nombre");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Crear Cliente", "Se crea un cliente", "Cliente");
				} else if (control.equals(menuItem22)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Cedula");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Eliminar Cliente", "Eliminando cliente", "ECliente");

				} else if (control.equals(menuItem20)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Cedula");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Busquedad de Cliente", "Se busca el cliente", "BCliente");

				} else if (control.equals(menuItem23)) {
					panel2 = Cliente.mostrarClientesExistente(panel2);
				} else if (control.equals(menuItem24)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					lista2.add(null);
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Nombre");
					lista3.add("Cedula");
					lista3.add("Salario");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Crear Empleado", "Se crea un empleado", "Empleado");

				} else if (control.equals(menuItem25)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Cedula");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Busquedad de Empleado", "Se busca el empleado", "Bemple");
				} else if (control.equals(menuItem27)) {
					boolean lista[] = { true, true, true, true, true, true, true, true };
					List<String> lista2 = new ArrayList<>();
					lista2.add(null);
					List<String> lista3 = new ArrayList<>();
					lista3.add("Cedula");
					FieldPanel f = new FieldPanel("Criterio", lista3, "Valor", lista2, lista);
					panel2 = f.crearFormulario(panel2, "Eliminar Empleado", "Eliminando Empleado", "EEmpleado");

				} else if (control.equals(menuItem29)) {
					panel2 = Empleado.mostrarEmpleadosExistente(panel2);
				} else if (control.equals(menuItem30)) {
					panel2 = Empleado.informacionHotel(panel2);
				}

			}
		}
	}

}
