package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			//
			// Welche Elemente gibt es und wo sollen sie positioniert werden
			//

			Label loginLabel = new Label("Login: ");
			loginLabel.setTranslateX(160);
			loginLabel.setTranslateY(80);

			TextField eingabeBenutzernameField = new TextField("Name");
			eingabeBenutzernameField.setTranslateX(135);
			eingabeBenutzernameField.setTranslateY(120);
			eingabeBenutzernameField.setMaxHeight(100);
			eingabeBenutzernameField.setMaxWidth(100);

			PasswordField eingabePasswordField = new PasswordField();
			eingabePasswordField.setTranslateX(135);
			eingabePasswordField.setTranslateY(160);
			eingabePasswordField.setMaxSize(100, 100);

			Button loginButton = new Button("Login");
			loginButton.setTranslateX(160);
			loginButton.setTranslateY(200);

			//
			// Erstellung
			//

			Group rootLogin = new Group();
			rootLogin.getChildren().add(loginLabel);
			rootLogin.getChildren().add(eingabeBenutzernameField);
			rootLogin.getChildren().add(eingabePasswordField);
			rootLogin.getChildren().add(loginButton);

			Scene loginScene = new Scene(rootLogin, 400, 400);

			primaryStage.setScene(loginScene);
			primaryStage.show();
			primaryStage.setTitle("Login");

			// =====================================================
			//
			// =====================================================

			EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					String name = eingabeBenutzernameField.getText();
					String pw = eingabePasswordField.getText();

					if (name.equals("root") && pw.equals("1234")) {
						try {
							Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
							Scene scene = new Scene(root, 1022, 593);
							scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
							primaryStage.setScene(scene);
							primaryStage.show();

						} catch (Exception e) {

						}

					} else {
						Label label1 = new Label("Login fehlgeschlagen");

						Stage stage = new Stage();
						HBox root = new HBox();
						root.getChildren().add(label1);
						Scene loginBereich = new Scene(root, 400, 200);
						stage.setScene(loginBereich);
						stage.show();

					}

				}

			};

			loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

			eingabePasswordField.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {

					if (event.getCode().equals(KeyCode.ENTER)) {

						String name = eingabeBenutzernameField.getText();
						String pw = eingabePasswordField.getText();

						if (name.equals("root") && pw.equals("1234")) {

							try {
								Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
								Scene scene = new Scene(root, 1022, 593);
								scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
								primaryStage.setScene(scene);
								primaryStage.show();

							} catch (Exception e) {

							}

						} else {
							Label label1 = new Label("Login nicht erfolgreich!");

							Stage stage = new Stage();
							HBox root = new HBox();
							root.getChildren().add(label1);
							Scene loginBereich = new Scene(root, 400, 200);
							stage.setScene(loginBereich);
							stage.show();

						}

					}
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

fgdgdfgdfg
