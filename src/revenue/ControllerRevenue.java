package revenue;

import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ControllerRevenue implements Initializable {

	@FXML
	private TextField nameRevenueField;
	@FXML
	private TextField valueRevenueField;
	
	private ObservableList<Revenue> observableRevenueList;

	Main main;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	@FXML
	public void saveAndClose(ActionEvent saveAndClosEvent) {
		try {
			Revenue revenue = new Revenue(nameRevenueField.getText(), Double.parseDouble(valueRevenueField.getText()));
			observableRevenueList.add(revenue);
			main.closeRevenue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setMain(Main main) {
		this.main = main;
	}

	public void setObservableList(ObservableList<Revenue> observableRevenueList) {
        this.observableRevenueList = observableRevenueList;
    }	
}