package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		try {
		Parent root = FXMLLoader.load(getClass().getResource("/View/Login.fxml"));
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void startApp(Stage Stage) throws Exception{
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/View/UI.fxml"));
			Scene scene = new Scene(root, 1022, 593);
			Stage.setScene(scene);
			Stage.show();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		
		launch(args);

	}

}
