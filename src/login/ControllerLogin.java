package login;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControllerLogin {

	@FXML
	TextField userNameField;
	@FXML
	PasswordField passwordField;
	@FXML
	Label hintLabel;

	private ModelLogin model;
	private Main main;

	@FXML
	void initialize() {
		model = new ModelLogin("test", "1234");
	}

	public void login(ActionEvent event) {

		if (model.isCorrectCredentials(userNameField.getText(), passwordField.getText())) {

			try {
				main.startApp();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			hintLabel.setVisible(true);
		}
	}

	@FXML
	public void loginEnter(KeyEvent event1) {

		if (event1.getCode().equals(KeyCode.ENTER)) {
			if (model.isCorrectCredentials(userNameField.getText(), passwordField.getText())) {

				try {
					main.startApp();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				hintLabel.setVisible(true);
			}
		}
	}

	public void setMain(Main main) {
		this.main = main;
	}
}