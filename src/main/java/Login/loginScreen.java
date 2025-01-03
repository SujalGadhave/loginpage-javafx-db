package Login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class loginScreen extends Application{

	public static void main(String[] args) {
		Application.launch();
	}
	
	@Override
	public void start(Stage baseStage) throws Exception {
		
		Stage stage = new Stage();
		stage.setTitle("Customer Login");
		
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/loginScreen.fxml"));
		
		Scene scene = new Scene(actorGroup, 600, 400);
		stage.setScene(scene);
		
		stage.show();
	}
}