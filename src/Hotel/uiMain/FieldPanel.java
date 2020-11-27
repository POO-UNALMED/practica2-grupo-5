package uiMain;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class FieldPanel extends Pane {
	private Label criterio = new Label();
	private List<String> lstCriterio = new ArrayList<>();
	private Label valor = new Label();
	private List<String> lstValor = new ArrayList<>();
	@SuppressWarnings("unused")
	private boolean lstNoedit[] = new boolean[8];
	private List<TextField> lstTextField = new ArrayList<>();
	private List<ComboBox> lstCombo = new ArrayList<>();
	private static String tipoClase;
	Button success = new Button("Aceptar");
	Button cancel = new Button("Cancelar");
	Alert a = new Alert(AlertType.NONE);

	private Label a1 = new Label();
	private Label a2 = new Label();

	public FieldPanel(String criterio, List<String> lstCriterio, String valor, List<String> lstValor,
			boolean[] lstNoedit) {
		super();
		this.criterio.setText(criterio);
		this.lstCriterio = lstCriterio;
		this.valor.setText(valor);
		this.lstValor = lstValor;
		this.lstNoedit = lstNoedit;

	}

	public GridPane crearFormulario(GridPane panel, String text1, String text2, String tipo) {
		tipoClase = tipo;
		panel.getChildren().clear();
		panel.setAlignment(Pos.TOP_LEFT);
		panel.setHgap(5);
		panel.setVgap(5);

		Botones1 pepe = new Botones1();
		success.setOnAction(pepe);
		cancel.setOnAction(pepe);

		a1.setText(text1);
		a1.setFont(new Font("Arial", 30));
		panel.add(a1, 0, 0, 5, 1);
		a2.setText(text2);
		a2.setFont(new Font("Arial", 20));
		panel.add(a2, 0, 1, 5, 1);

		this.criterio.setFont(new Font("Arial", 15));
		panel.add(this.criterio, 0, 10);
		this.valor.setFont(new Font("Arial", 15));
		panel.add(this.valor, 15, 10);

		int i = 20;
		int aux = 0;
		for (String a : lstCriterio) {
			Label a1 = new Label(a);
			a1.setFont(new Font("Arial", 15));
			panel.add(a1, 0, i);
			if (lstValor.get(aux) == "tipoHabitacion") {
				final ComboBox<String> tipoHab = new ComboBox<>();
				tipoHab.getItems().addAll("Sencilla", "Familiar", "Suite");
				tipoHab.setValue("Sencilla");
				lstCombo.add(tipoHab);
				panel.add(tipoHab, 15, i);
			} else if (lstValor.get(aux) == "temporada") {
				final ComboBox<String> temp = new ComboBox<>();
				temp.getItems().addAll("Baja", "Alta");
				temp.setValue("Alta");
				lstCombo.add(temp);
				panel.add(temp, 15, i);
			} else if (lstValor.get(aux) == "fecha") {
				TextField p = new TextField();
				p.setEditable(lstNoedit[aux]);
				lstTextField.add(p);
				panel.add(p, 15, i);
				Label ad = new Label("dd/mm/aaaa");
				ad.setFont(new Font("Arial", 11));
				panel.add(ad, 20, i);
			} else if (lstValor.get(aux) != null) {
				TextField p = new TextField(lstValor.get(aux));
				p.setEditable(lstNoedit[aux]);
				lstTextField.add(p);
				panel.add(p, 15, i);
			} else {
				TextField p = new TextField();
				lstTextField.add(p);
				panel.add(p, 15, i);
			}
			i += 5;
			aux++;
		}
		panel.add(cancel, 0, i + 5);
		panel.add(success, 15, i + 5);

		return panel;

	}

	class Botones1 implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			boolean isCorrect = false;
			List<String> data = new ArrayList<>();
			Object control = e.getSource();
			if (control instanceof Button) {
				if (control.equals(success)) {
					for (ComboBox<String> item : lstCombo) {
						data.add(item.getValue());
					}
					for (TextField item : lstTextField) {
						if (item.getText().isEmpty()) {
							isCorrect = false;
							a.setAlertType(AlertType.ERROR);
							a.setTitle("Error");
							a.setHeaderText("Campo vacío");
							a.setContentText("Uno o varios campos estan vacios");
							a.show();
							break;
						} else {
							isCorrect = true;
							data.add(item.getText());
						}
					}
					if (isCorrect) {

						if (validate.Guardar(data, tipoClase)) {
							a.setAlertType(AlertType.CONFIRMATION);
							a.setTitle("Success");
							a.setHeaderText("Guardado exitosamente");
							a.show();
						} else {
							a.setAlertType(AlertType.ERROR);
							a.setTitle("Error");
							a.setHeaderText("Error al intentar guardar");
							a.setContentText("Uno o varios campos son invalidos");
							a.show();
						}

					}
				} else if (control.equals(cancel)) {

				}
			}
		}
	}

}
