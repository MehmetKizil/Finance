package revenue;

import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ControllerRevenue implements Initializable {

	@FXML
	private TextField nameRevenueField;
	@FXML
	private TextField valueRevenueField;

	Main main;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	@FXML
	public void saveAndClose(ActionEvent saveAndClosEvent) {
		try {
			main.closeRevenue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setMain(Main main) {
		this.main = main;
	}

	
}


























//package revenue;
//
//import application.Main;
//import financeApp.ControllerUI;
//import financeApp.ModelUI;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.TextField;
//
//public class ControllerRevenue {
//
//	@FXML
//	private TextField nameRevenueField;
//	@FXML
//	private TextField valueRevenueField;
//
//	Revenue revenue;
//	ModelUI modelUI;
//	ControllerUI controllerUI;
//	Main main;
//
//	public void saveAndClose(ActionEvent saveAndClosEvent) {
//		revenue.getName().set(nameRevenueField.getText());
//		revenue.getValue().set(valueRevenueField.getText());
//		modelUI.getRevenueList().add(revenue);
//		controllerUI.setItems(modelUI.getRevenueList());
//		try {
//			main.closeRevenue();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void setMain(Main main) {
//		this.main = main;
//	}
//}
