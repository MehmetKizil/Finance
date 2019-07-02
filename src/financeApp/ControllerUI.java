package financeApp;

import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import revenue.Revenue;

public class ControllerUI implements Initializable{

	private Main mainUI;
	@FXML
	private TableView<Revenue> listRevenue;
	@FXML
	private TableColumn<Revenue, String> nameColumnRevenue;
	@FXML
	private TableColumn<Revenue, String> valueColumnRevenue;
	
	private ObservableList<Revenue> revenues = FXCollections.observableArrayList();
	
//	ModelUI modelUI;
	
	@FXML
	public void addRevenue(ActionEvent revenueEvent) {
		try {
			mainUI.startRevenue(revenues);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nameColumnRevenue.setCellValueFactory(new PropertyValueFactory<>("name"));
		valueColumnRevenue.setCellValueFactory(new PropertyValueFactory<>("value"));
		listRevenue.setItems(revenues);
	}
	
	public void setMainUI(Main mainUI) {
		this.mainUI = mainUI;
	}	
}