package dad.javafx.mvc;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertaInicio {

	public static void mostrarAlert(AlertType tipoAlerta, String cabecera, String contenido) {
		Alert alert = new Alert(tipoAlerta);
		alert.setTitle("Iniciar sesión");
		alert.setHeaderText(cabecera);
		alert.setContentText(contenido);
		
		alert.showAndWait();
	}	
	
}
