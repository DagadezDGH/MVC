package dad.javafx.mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MVC extends Application {

	@Override
	public void start(Stage primaryStage) {
		Controller controller = new Controller();
		Scene scene = new Scene(controller.getView().getRoot(), 300, 250);
		primaryStage.setTitle("Iniciar sesión");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
