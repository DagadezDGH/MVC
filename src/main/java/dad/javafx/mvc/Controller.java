package dad.javafx.mvc;

import dad.javafx.mvc.AlertaInicio;
import dad.javafx.mvc.Modelo;
import dad.javafx.mvc.View;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;

public class Controller {

	private View view = new View();
	private Modelo model = new Modelo();

	public Controller() {
		view.getAccessButton().setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				try {
					boolean isValid = model.checkLogin(view.getUser(), view.getPassword());
					if (isValid) {
						AlertaInicio.mostrarAlert(AlertType.INFORMATION, "Acceso permitido",
								"Las credenciales de acceso son válidas.");
					} else {
						AlertaInicio.mostrarAlert(AlertType.ERROR, "Acceso denegado",
								"El usuario y/o contraseña no son válidos.");
					}
				} catch (Exception e) {
					AlertaInicio.mostrarAlert(AlertType.ERROR, "Error", e.getMessage());
				}
			};

		});

		view.getCancelButton().setOnAction(new EventHandler<ActionEvent>() {

			
			public void handle(ActionEvent event) {
				view.getCancelButton().setOnAction(e -> Platform.exit());
			}
		});
	}

	public View getView() {
		return view;
	}

}

