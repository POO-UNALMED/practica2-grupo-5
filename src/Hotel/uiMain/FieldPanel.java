package uiMain;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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

	public GridPane crearFormulario(GridPane panel, String text1, String text2) {
		panel.getChildren().clear();
		panel.setAlignment(Pos.TOP_LEFT);
		panel.setHgap(5);
		panel.setVgap(5);

		a1.setText(text1);
		a1.setFont(new Font("Arial", 30));
		panel.add(a1, 30, 0, 5, 1);
		a2.setText(text2);
		a2.setFont(new Font("Arial", 20));
		panel.add(a2, 15, 1, 5, 1);

		this.criterio.setFont(new Font("Arial", 15));
		panel.add(this.criterio, 15, 10);
		this.valor.setFont(new Font("Arial", 15));
		panel.add(this.valor, 45, 10);

		int i = 20;
		int aux = 0;
		for (String a : lstCriterio) {
			Label a1 = new Label(a);
			a1.setFont(new Font("Arial", 15));
			panel.add(a1, 15, i);
			if (lstValor.get(aux) != null) {
				panel.add(new TextField(lstValor.get(aux)), 45, i);
			} else {
				panel.add(new TextArea(), 0, i);
			}
			i += 5;
			aux++;
		}

		return panel;

	}

}
