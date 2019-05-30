package login;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerLogin {
	
	ModelLogin model = new ModelLogin();
	@FXML private TextField userNameField;
	@FXML private PasswordField passwordField;
	
	@FXML	
	public void login(ActionEvent event) {
		model.setUserName(userNameField.getText());
		model.setPassword(passwordField.getText());
		
		if (model.getUserName().equals("test") && model.getPassword().equals("1234")) {
			Stage stage = new Stage();
			Main startUI = new Main();
			
			try {
				startUI.startApp(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Try again");
		}
	}
}