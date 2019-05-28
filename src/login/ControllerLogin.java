package login;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerLogin {
	
	@FXML private Button loginButton;
	@FXML private TextField userNameField;
	@FXML private PasswordField passwordField;
	
	
	
	public void login(ActionEvent event) {
		if (userNameField.getText().equals("test") && passwordField.getText().equals("1234")) {
			Stage stage = new Stage();
			Main startUI = new Main();
			
			try {
				startUI.startApp(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
}