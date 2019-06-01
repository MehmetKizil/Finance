package financeApp;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerUI {

	private Main mainUI;

	@FXML
	public void addRevenue(ActionEvent revenueEvent) {
		try {
			mainUI.startRevenue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setMainUI(Main mainUI) {
		this.mainUI = mainUI;
	}
}
