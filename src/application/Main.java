package application;

import financeApp.ControllerUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.ControllerLogin;

public class Main extends Application {

	private Stage primaryStage;
	private Parent root;
	private Parent rootRevenue;

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {

			this.primaryStage = primaryStage;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/login/LoginUI.fxml"));
			root = loader.load();
			ControllerLogin controller = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startApp() throws Exception {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/financeApp/UI.fxml"));
			root = loader.load();
			ControllerUI controllerUI = loader.getController();
			controllerUI.setMainUI(this);

			Scene scene = new Scene(root, 1022, 593);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startRevenue() throws Exception {
		try {
			FXMLLoader revenueLoader = new FXMLLoader(getClass().getResource("/revenue/RevenueUI.fxml"));
			rootRevenue = revenueLoader.load();
			Stage revenueStage = new Stage();
			Scene revenueScene = new Scene(rootRevenue, 333, 200);
			revenueStage.setScene(revenueScene);
			revenueStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}