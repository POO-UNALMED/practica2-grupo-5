package uiMain;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class iuMainInterfaz {

	GridPane panel2 = new GridPane();
	MenuItem menuItem1 = new MenuItem("Reserva");
	MenuItem menuItem2 = new MenuItem("Check-in");
	MenuItem menuItem3 = new MenuItem("Habitaciones");
	MenuItem menuItem4 = new MenuItem("Pagos");
	MenuItem menuItem5 = new MenuItem("Clientes");
	MenuItem menuItem6 = new MenuItem("Empleados");
	MenuItem menuItem7 = new MenuItem("Informacion Hotel");
	MenuItem acerca;
	MenuItem salir;
	MenuItem hpoo;
	Label cajapanel2 = new Label();

	public void crearEscenaMenu() {

		Stage panelito = new Stage();
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		MenuBar barraMenu = new MenuBar();
		Menu menu1 = new Menu("Archivo");
		Menu menu2 = new Menu("Procesos y Consultas");
		acerca = new MenuItem("Acerca de");
		salir= new MenuItem("Salir");
		hpoo=new MenuItem("Hotel POOderoso");
		menu2.getItems().addAll(menuItem1);
		menu2.getItems().addAll(menuItem2);
		menu2.getItems().addAll(menuItem3);
		menu2.getItems().addAll(menuItem4);
		menu2.getItems().addAll(menuItem5);
		menu2.getItems().addAll(menuItem6);
		menu2.getItems().addAll(menuItem7);

		Menu menu3 = new Menu("Ayuda");
		menu3.getItems().addAll(acerca);
		menu1.getItems().addAll(hpoo);
		menu1.getItems().addAll(salir);
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

		barraMenu.getMenus().add(menu1);
		barraMenu.getMenus().add(menu2);
		barraMenu.getMenus().add(menu3);
		root.setTop(new VBox(barraMenu));

		panel2.setAlignment(Pos.CENTER);
		root.setCenter(panel2);
		Label cajapanel = new Label("inicio");
		panel2.add(cajapanel, 0, 0);

		panelito.setTitle("Hotel POOderoso");
		Scene mySceneMenu = new Scene(root, 750, 650);
		panelito.setScene(mySceneMenu);
		panelito.show();

	}

	class UnicoHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			Object control = e.getSource();
			if (control instanceof MenuItem) {
				if (control.equals(acerca)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					cajapanel2.setText(" Nombre:  Edwar Jose Londono Correa\n   -Correo: elondonoc@unal.edu.co\n"
							+ "Nombre: Sebastian Rendon Arteaga\n   -Correo: serendona@unal.edu.co\n"
							+ "Nombre: Diego Andres Chavarria Riano\n   -Correo: dchavarriar@unal.edu.co\n"
							+ "Nombre: Andres Castrillon Velasquez\n   -Correo: acastrillonv@unal.edu.co");
					cajapanel2.setFont(new Font("Arial", 30));
					panel2.add(cajapanel2, 0, 0);
				}
				else if (control.equals(hpoo)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("inicio"), 0, 0);
				}
				else if (control.equals(menuItem1)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("io"), 0, 0);
				}
				else if (control.equals(menuItem2)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("ini"), 0, 0);
				}
				else if (control.equals(menuItem3)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("io"), 0, 0);
				}
				else if (control.equals(menuItem4)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("iio"), 0, 0);
				}
				else if (control.equals(menuItem5)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("i"), 0, 0);
				}
				else if (control.equals(menuItem6)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("ini"), 0, 0);
				}
				else if (control.equals(menuItem7)) {
					panel2.getChildren().clear();
					panel2.setAlignment(Pos.CENTER);
					
					panel2.add(new Label("inici"), 0, 0);
				}
				

			}
		}
	}

}
