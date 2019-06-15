package revenue;

import financeApp.ControllerUI;
import financeApp.ModelUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerRevenue {

	@FXML
	private TextField nameRevenueField;
	@FXML
	private TextField valueRevenueField;

	Revenue revenue;
	ModelUI modelUI;
	ControllerUI controllerUI;

	public void saveAndClose(ActionEvent saveAndClosEvent) {
		revenue = new Revenue(nameRevenueField.getText(), valueRevenueField.getText());
		modelUI = new ModelUI();
		modelUI.addData(revenue);
		controllerUI = new ControllerUI();
		controllerUI.setItems(modelUI.getData());
	}
}
