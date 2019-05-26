package controller;

import java.io.IOException;

import application.Main;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.ModelLogin;



public class ControllerLogin{
	
	
	ModelLogin login = new ModelLogin();
	Main start = new Main();
	Stage Stage;
	
	
	EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
	
		@Override
		public void handle(MouseEvent event) {

			if (login.getUserNameNew().equals("tester") && login.getPasswordNew().equals("1234")) {
					try {
						start.startApp(Stage);
					} catch (Exception e) {
						e.printStackTrace();
					}
			}else {
				Label label1 = new Label("Login nicht erfolgreich!");

				Stage stage = new Stage();
				HBox root = new HBox();
				root.getChildren().add(label1);
				Scene loginBereich = new Scene(root, 400, 200);
				stage.setScene(loginBereich);
				stage.show();
			}
			
		}

	};
	
	
		


	

}
