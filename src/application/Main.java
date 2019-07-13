package application;

import entry.ControllerEntry;
import entry.Entry;
import financeApp.ControllerUI;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.ControllerLogin;

public class Main extends Application {

	private Stage primaryStage;
	private Stage EntryStage;
	private Parent root;
	private Parent rootEntry;
	ControllerUI idControllerUI;

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

	public void startEntry(ObservableList<Entry> list, boolean entryType) throws Exception {
		try {
			FXMLLoader entryLoader = new FXMLLoader(getClass().getResource("/entry/EntryUI.fxml"));
			rootEntry = entryLoader.load();
			ControllerEntry controllerEntry = entryLoader.getController();
			controllerEntry.setMain(this);
			if (entryType) {
				controllerEntry.setObservableRevenueList(list);
				controllerEntry.setEntryType(true);
			}else {
				controllerEntry.setObservableOutgoingList(list);
				controllerEntry.setEntryType(false);
			}
			
			EntryStage = new Stage();
			Scene entryScene = new Scene(rootEntry, 333, 200);
			EntryStage.setScene(entryScene);
			EntryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeEntry() throws Exception {
		try {
			EntryStage.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}