package model;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class ModelLogin {

	@FXML
	TextField userName;
	TextField password;
	
	private String userNameNew;
	private String passwordNew;
	
	
	
	public void userNameTyped() {
		userNameNew = userName.getText();
		
	}
	
	public void passwordTyped() {
		passwordNew = password.getText();
	}

	public String getUserNameNew() {
		return userNameNew;
	}

	public void setUserNameNew(String userNameNew) {
		this.userNameNew = userNameNew;
	}

	public String getPasswordNew() {
		return passwordNew;
	}

	public void setPasswordNew(String passwordNew) {
		this.passwordNew = passwordNew;
	}
	
	
	
}
