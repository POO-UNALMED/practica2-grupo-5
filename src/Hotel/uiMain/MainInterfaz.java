/*Clase encargada de cargar la interfaz principal del usuario. se conecta con la carpeta de imagenes del proyecto y tiene un serie de eventos con el mouse que modifican el comportamiento de las imagenes*/
package uiMain;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainInterfaz extends Application {
	Button ent = new Button("Entrar");
	Label caja = new Label();
	GridPane p6 = new GridPane();
	GridPane p5 = new GridPane();
	GridPane p4 = new GridPane();
	private int cont;
	private int cont1;
	public ImageView a;
	public ImageView i1;
	public ImageView i2;
	public ImageView i3;
	public ImageView i4;
	public ImageView i5;
	public ImageView i6;
	public ImageView i7;
	public ImageView i8;
	public ImageView i9;
	public ImageView i10;
	public ImageView i11;
	public ImageView i12;
	public ImageView i13;
	public ImageView i14;
	public ImageView i15;
	public ImageView i16;
	public ImageView i17;
	public ImageView i18;
	public ImageView i19;
	public ImageView i20;
	public ImageView i21;

	@Override
	public void start(Stage hotel) throws Exception { // Metodo que carga la primer interfaz con la que interactua el
														// usuario, Muestra las fotos y la informacion de los empleados
														// del hotel y sus fotos.
		global globalServices = new global();
		globalServices.CargarSesion();

		Image im1 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im1.jpg"));
		Image im2 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im2.jpeg"));
		Image im3 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im3.jpeg"));
		Image im4 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im4.jpeg"));
		Image im5 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im5.jpg"));
		Image im6 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im6.jpg"));
		Image im7 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im7.jpg"));
		Image im8 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im8.jpg"));
		Image im9 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im9.jpg"));
		Image im10 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im10.jpg"));
		Image im11 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im11.jpg"));
		Image im12 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im12.jpg"));
		Image im13 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im13.jpeg"));
		Image im14 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im14.jpeg"));
		Image im15 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im15.jpeg"));
		Image im16 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im16.jpeg"));
		Image im17 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im17.jpg"));
		Image im18 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im18.jpg"));
		Image im19 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im19.jpg"));
		Image im20 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im20.jpg"));
		Image im21 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\im21.jpg"));

		i1 = new ImageView(im1);
		i1.setFitWidth(130);
		i1.setFitHeight(130);

		i2 = new ImageView(im2);
		i2.setFitWidth(130);
		i2.setFitHeight(130);

		i3 = new ImageView(im3);
		i3.setFitWidth(130);
		i3.setFitHeight(130);

		i4 = new ImageView(im4);
		i4.setFitWidth(130);
		i4.setFitHeight(130);

		i5 = new ImageView(im5);
		i5.setFitWidth(130);
		i5.setFitHeight(130);

		i6 = new ImageView(im6);
		i6.setFitWidth(130);
		i6.setFitHeight(130);

		i7 = new ImageView(im7);
		i7.setFitWidth(130);
		i7.setFitHeight(130);

		i8 = new ImageView(im8);
		i8.setFitWidth(130);
		i8.setFitHeight(130);

		i9 = new ImageView(im9);
		i9.setFitWidth(130);
		i9.setFitHeight(130);

		i10 = new ImageView(im10);
		i10.setFitWidth(130);
		i10.setFitHeight(130);

		i11 = new ImageView(im11);
		i11.setFitWidth(130);
		i11.setFitHeight(130);

		i12 = new ImageView(im12);
		i12.setFitWidth(130);
		i12.setFitHeight(130);

		i13 = new ImageView(im13);
		i13.setFitWidth(130);
		i13.setFitHeight(130);

		i14 = new ImageView(im14);
		i14.setFitWidth(130);
		i14.setFitHeight(130);

		i15 = new ImageView(im15);
		i15.setFitWidth(130);
		i15.setFitHeight(130);

		i16 = new ImageView(im16);
		i16.setFitWidth(130);
		i16.setFitHeight(130);

		i17 = new ImageView(im17);
		i17.setFitWidth(300);
		i17.setFitHeight(300);
		i18 = new ImageView(im18);
		i18.setFitWidth(300);
		i18.setFitHeight(300);
		i19 = new ImageView(im19);
		i19.setFitWidth(300);
		i19.setFitHeight(300);
		i20 = new ImageView(im20);
		i20.setFitWidth(300);
		i20.setFitHeight(300);
		i21 = new ImageView(im21);
		i21.setFitWidth(300);
		i21.setFitHeight(300);

		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		BorderPane p1 = new BorderPane();
		BorderPane p2 = new BorderPane();
		BorderPane p3 = new BorderPane();
		cont = 1;

		Botones1 pepe = new Botones1();
		ent.setOnAction(pepe);

		p4.setOnMouseEntered(mouseHandler);
		caja.setText(
				" Nombre:  Edwar Jose Londono Correa\n Ig: londunic\n Carrera: Ing. Sistemas e informatica\n Universidad Nacional de Colombia");
		caja.setFont(new Font("Arial", 15));
		p6.getChildren().clear();
		p6.add(i1, 0, 0);
		p6.add(i2, 0, 1);
		p6.add(i3, 1, 0);
		p6.add(i4, 1, 1);

		root.setLeft(p1);
		root.setRight(p2);
		p1.setTop(p3);
		p1.setBottom(p4);
		p2.setTop(p5);
		p2.setBottom(p6);

		Label b = new Label("Bienvenido al Hotel POOderoso\n Siempre a sus servicios. :D");
		b.setFont(new Font("Arial", 15));
		p3.setCenter(b);

		p5.setAlignment(Pos.CENTER);
		p5.setHgap(5);
		p5.setVgap(5);
		Label c = new Label("            Desarrolladores");
		c.setFont(new Font("Arial", 15));
		p5.add(c, 0, 0, 4, 1);
		p5.add(caja, 0, 2, 4, 1);
		p5.setOnMouseClicked(mouseHandler1);

		p6.setAlignment(Pos.CENTER);

		p4.setAlignment(Pos.CENTER);
		p4.setHgap(5);
		p4.setVgap(5);
		p4.add(i17, 0, 0, 3, 3);
		p4.add(ent, 0, 5);

		MenuBar barraMenu = new MenuBar();
		Menu menu1 = new Menu("Incio");
		barraMenu.getMenus().add(menu1);
		MenuItem menuItem1 = new MenuItem("Descripcion");
		MenuItem menuItem2 = new MenuItem("Salir");
		SeparatorMenuItem separator = new SeparatorMenuItem();
		menu1.getItems().add(menuItem1);
		menu1.getItems().addAll(separator, menuItem2);
		root.setTop(new VBox(barraMenu));

		hotel.setTitle("Hotel POOderoso");
		Scene myScene = new Scene(root, 600, 450);
		hotel.setScene(myScene);
		hotel.show();

	}

	public static void main(String[] args) {// INICIO DE LA INTERFAZ GRAFICA
		launch(args);
	}

	EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() {// Cambio del texto de informacion de los
																				// empleado al hacer click sobre la zona
		@Override
		public void handle(MouseEvent mouseEvent) {
			cont1++;
			p6.getChildren().clear();
			switch (cont1) {
			case 1:
				caja.setText(
						" Nombre:  Edwar Jose Londono Correa\n Ig: londunic\n Carrera: Ing. Sistemas e informatica\n Universidad Nacional de Colombia");
				caja.setFont(new Font("Arial", 15));
				p6.getChildren().clear();
				p6.add(i1, 0, 0);
				p6.add(i2, 0, 1);
				p6.add(i3, 1, 0);
				p6.add(i4, 1, 1);
				break;
			case 2:
				caja.setText(
						" Nombre:  Sebastian Rendon Arteaga\n Ig: sebasrendon12\n Carrera: Ing. Sistemas e informatica\n Universidad Nacional de Colombia");
				caja.setFont(new Font("Arial", 15));
				p6.getChildren().clear();
				p6.add(i9, 0, 0);
				p6.add(i10, 0, 1);
				p6.add(i11, 1, 0);
				p6.add(i12, 1, 1);
				break;
			case 3:
				caja.setText(
						" Nombre:  Andres Castrillon Velasquez\n Ig: acasv\n Carrera: Ing. Sistemas e informatica\n Universidad Nacional de Colombia");
				caja.setFont(new Font("Arial", 15));
				p6.getChildren().clear();
				p6.add(i13, 0, 0);
				p6.add(i14, 0, 1);
				p6.add(i15, 1, 0);
				p6.add(i16, 1, 1);
				break;
			case 4:
				caja.setText(
						" Nombre:  Diego Andres Chavarria\n Ig: diego_chava_25\n Carrera: Ing. Sistemas e informatica\n Universidad Nacional de Colombia");
				caja.setFont(new Font("Arial", 15));
				p6.getChildren().clear();
				p6.add(i5, 0, 0);
				p6.add(i6, 0, 1);
				p6.add(i7, 1, 0);
				p6.add(i8, 1, 1);
				cont1 = 0;
				break;

			default:
				break;
			}
		}
	};

	class Botones1 implements EventHandler<ActionEvent> {// Boton de Entrada, Crea la siguiente escena del menu
		@Override
		public void handle(ActionEvent e) {
			Object control = e.getSource();
			if (control instanceof Button) {
				if (control.equals(ent)) {
					new iuMainInterfaz().crearEscenaMenu();

				}
			}
		}
	}

	EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent mouseEvent) {
			cont++;
			p4.getChildren().clear();
			switch (cont) {
			case 1:
				p4.add(i17, 0, 0, 3, 3);
				break;
			case 2:
				p4.add(i18, 0, 0, 3, 3);
				break;
			case 3:
				p4.add(i19, 0, 0, 3, 3);
				break;
			case 4:
				p4.add(i20, 0, 0, 3, 3);
				break;
			case 5:
				p4.add(i21, 0, 0, 3, 3);
				cont = 0;
				break;

			default:
				break;
			}
			p4.add(ent, 0, 5);
		}
	};
}