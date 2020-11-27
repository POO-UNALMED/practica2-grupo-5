package uiMain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import gestorAplicacion.Hotel.Habitacion;
import gestorAplicacion.Hotel.Reserva;
import gestorAplicacion.Terceros.Cliente;
import gestorAplicacion.Terceros.Empleado;
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
	private static int pos1 = 0;
	private static GridPane panes;
	private static List<String> data = new ArrayList<>();
	Button success = new Button("Aceptar");
	Button cancel = new Button("Cancelar");
	Button confirm = new Button("Confirmar");
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
		panes = panel;
		panel.getChildren().clear();
		panel.setAlignment(Pos.TOP_LEFT);
		panel.setHgap(5);
		panel.setVgap(5);

		Botones1 pepe = new Botones1();
		success.setOnAction(pepe);
		cancel.setOnAction(pepe);

		a1.setText(text1);
		a1.setFont(new Font("Arial", 25));
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
		pos1 = i + 10;

		return panel;

	}

	class Botones1 implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			global globalServices = new global();
			boolean isCorrect = false;

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
						try {
							if(tipoClase.equals("bhabi")) {
								String t="";
								if (Habitacion.getLstHabitacion().size() > 0) {
									boolean aux=true;
									for (Habitacion h :Habitacion.getLstHabitacion()) {
										if (h.getNumeroHabitacion() == Integer.parseInt(data.get(0))) {
											t+="Esta es su habitacion: \n";
											t+="Numero de habitacion: " + h.getNumeroHabitacion()+"\n";
											t+="Tipo: " + h.getTipo()+"\n";
											t+="Descripcion: " + h.getDescripcion()+"\n";
											aux = false;
											break;
										}
									}
									if(aux) {
										t+="No se encontro la habitacion";
										a.setAlertType(AlertType.ERROR);
										a.setHeaderText("Alerta");
										a.setContentText(t);
										a.show();
									}
									else {
										a.setAlertType(AlertType.CONFIRMATION);
										a.setTitle("Encontrado");
										a.setHeaderText(t);
										a.show();
									}	
								}else {
									a.setAlertType(AlertType.ERROR);
									a.setTitle("Alerta");
									a.setHeaderText("Busquedad Fallida");
									a.show();
								}
								
							}
							else if(tipoClase.equals("Bemple")) {
								String t="";
								if (Empleado.getLstEmpleado().size() > 0) {
									boolean aux=true;
									for (Empleado ee :Empleado.getLstEmpleado()) {
										if (ee.getCedula() == Integer.parseInt(data.get(0))) {
											t+="Datos del Empleado: \n";
											t+="Nombre: " + ee.getNombre()+"\n";
											t+="Cedula: " + ee.getCedula()+"\n";
											aux = false;
											break;
										}
									}
									if(aux) {
										t+="No se encontro el empleado";
										a.setAlertType(AlertType.ERROR);
										a.setHeaderText("Alerta");
										a.setContentText(t);
										a.show();
									}
									else {
										a.setAlertType(AlertType.CONFIRMATION);
										a.setTitle("Encontrado");
										a.setHeaderText(t);
										a.show();
									}	
								}else {
									a.setAlertType(AlertType.ERROR);
									a.setTitle("Alerta");
									a.setHeaderText("Busquedad Fallida");
									a.show();
								}
							}
							else if(tipoClase.equals("BCliente")) {
								String t="";
								if (Cliente.getLstCliente().size() > 0) {
									boolean aux=true;
									for (Cliente c :Cliente.getLstCliente()) {
										if (c.getCedula() == Integer.parseInt(data.get(0))) {
											t+="Datos del Cliente: \n";
											t+="Nombre: " + c.getNombre()+"\n";
											t+="Cedula: " + c.getCedula()+"\n";
											aux = false;
											break;
										}
									}
									if(aux) {
										t+="No se encontro el cliente";
										a.setAlertType(AlertType.ERROR);
										a.setHeaderText("Alerta");
										a.setContentText(t);
										a.show();
									}
									else {
										a.setAlertType(AlertType.CONFIRMATION);
										a.setTitle("Encontrado");
										a.setHeaderText(t);
										a.show();
									}	
								}else {
									a.setAlertType(AlertType.ERROR);
									a.setTitle("Alerta");
									a.setHeaderText("Busquedad Fallida");
									a.show();
								}
							}
							else if(tipoClase.equals("BReserva")) {
								String t="";
								if (Reserva.getLstReserva().size() > 0) {
									boolean aux=true;
									for (Reserva r : Reserva.getLstReserva()) {
										if (r.getId() == Integer.parseInt(data.get(0))) {
											// Se le da formato a las fechas para que imprima dd/mm/yyyy
											Calendar fechaIniAux = Calendar.getInstance();
											fechaIniAux.setTime(r.getFechaInicio());
											Calendar fechaFinAux = Calendar.getInstance();
											fechaFinAux.setTime(r.getFechaFin());
											String string1 = fechaIniAux.get(Calendar.DATE) + "/" + (fechaIniAux.get(Calendar.MONTH) + 1)
													+ "/" + fechaIniAux.get(Calendar.YEAR);
											String string2 = fechaFinAux.get(Calendar.DATE) + "/" + (fechaFinAux.get(Calendar.MONTH) + 1)
													+ "/" + fechaFinAux.get(Calendar.YEAR);

											t+="Esta es su reserva: \n";
											t+="Numero de reserva: " + r.getId()+"\n";
											t+="Cliente: " + r.getCliente().getNombre()+"\n";
											t+="Fecha de la reserva: " + r.getFecha()+"\n";
											t+="Tiempo de la reserva: Desde " + string1 + " hasta " + string2+"\n";
											aux=false;
										}
									}
									if(aux) {
										t+="No se encontro la reserva";
										a.setAlertType(AlertType.ERROR);
										a.setHeaderText("Alerta");
										a.setContentText(t);
										a.show();
									}
									else {
										a.setAlertType(AlertType.CONFIRMATION);
										a.setTitle("Encontrado");
										a.setHeaderText(t);
										a.show();
									}
								}
								else {
									a.setAlertType(AlertType.ERROR);
									a.setTitle("Alerta");
									a.setHeaderText("Busquedad Fallida");
									a.show();
								}
								
							}
							else if (tipoClase.equals("Reserva")) {
								Date fechaI;
								Date fechaF;
								fechaI = globalServices.StringToDate(data.get(3));
								fechaF = globalServices.StringToDate(data.get(4));
								if (fechaI.compareTo(fechaF) > 0) {
									throw new Exception("El tiempo de la Reserva es invalido");
								}
								final ComboBox<String> habs = new ComboBox<>();
								List<String> habitaciones = new ArrayList<>();
								for (Habitacion h : Habitacion.getLstHabitacion()) {
									if (Habitacion.isAvailable(h, fechaI, fechaF)) {
										habitaciones.add(h.getNumeroHabitacion() + "-" + h.getTipo());
									}
								}
								if (habitaciones.size() == 0) {
									throw new Exception("No hay habitaciones disponibles");
								}
								Label a1 = new Label("Habitacion");
								a1.setFont(new Font("Arial", 15));
								panes.add(a1, 0, pos1);
								habs.getItems().addAll(habitaciones);
								lstCombo.add(habs);
								habs.setValue(habitaciones.get(0));
								panes.add(habs, 15, pos1);
								lstCombo.add(habs);
								panes.add(confirm, 0, pos1 + 5);
								Botones1 pepe = new Botones1();
								confirm.setOnAction(pepe);
							} else {
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
						} catch (Exception e2) {
							a.setAlertType(AlertType.ERROR);
							a.setTitle("Error");
							a.setContentText(e2.getMessage());
							a.show();
						}

					}
				} else if (control.equals(cancel)) {

				} else if (control.equals(confirm)) {
					try {
						String numHab = ((String) lstCombo.get(lstCombo.size() - 1).getValue()).split("-")[0];
						data.add(numHab);
						validate.Guardar(data, "Reserva");
						a.setAlertType(AlertType.INFORMATION);
						a.setHeaderText("Reserva creada exitosamente");
						a.show();
					} catch (Exception e2) {
						a.setAlertType(AlertType.ERROR);
						a.setTitle("Error");
						a.setContentText(e2.getMessage());
						a.show();
					}
				}
			}
		}
	}

}
