package uiMain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class iuMainInterfaz{


	public static void crearEscenaMenu() {
		
		Stage panelito=new Stage();
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		MenuBar barraMenu = new MenuBar();
		Menu menu1 = new Menu("Archivo");
		Menu menu2 = new Menu("Procesos y Consultas");
		MenuItem menuItem1 = new MenuItem("Reserva");
		MenuItem menuItem2 = new MenuItem("Check-in");
		MenuItem menuItem3 = new MenuItem("Habitaciones");
		MenuItem menuItem4 = new MenuItem("Pagos");
		MenuItem menuItem5 = new MenuItem("Clientes");
		MenuItem menuItem6 = new MenuItem("Empleados");
		MenuItem menuItem7 = new MenuItem("Informacion Hotel");
		menu2.getItems().addAll(menuItem1);
		menu2.getItems().addAll(menuItem2);
		menu2.getItems().addAll(menuItem3);
		menu2.getItems().addAll(menuItem4);
		menu2.getItems().addAll(menuItem5);
		menu2.getItems().addAll(menuItem6);
		menu2.getItems().addAll(menuItem7);
		Menu menu3 = new Menu("Ayuda");
		barraMenu.getMenus().add(menu1);
		barraMenu.getMenus().add(menu2);
		barraMenu.getMenus().add(menu3);
		root.setTop(new VBox(barraMenu));
		
		
		GridPane p2 = new GridPane();
		
		
		panelito.setTitle("Hotel POOderoso");
		Scene mySceneMenu = new Scene(root, 750, 650);
		panelito.setScene(mySceneMenu);
		panelito.show();
		
	}
	

}
