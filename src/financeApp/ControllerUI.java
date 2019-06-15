package financeApp;

import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import revenue.Revenue;

public class ControllerUI {

	private Main mainUI;
	@FXML
	private TableView<Revenue> listRevenue;
	@FXML
	private TableColumn<Revenue, String> nameColumnRevenue;
	@FXML
	private TableColumn<Revenue, String> valueColumnRevenue;
	
	ModelUI modelUI = new ModelUI();

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
	
	public void setItems(ObservableList<Revenue> data1) {
		nameColumnRevenue.setCellValueFactory(new PropertyValueFactory<Revenue, String>("name"));
		valueColumnRevenue.setCellValueFactory(new PropertyValueFactory<Revenue, String>("value"));	
		listRevenue.setItems(data1);
		listRevenue.getColumns().addAll(nameColumnRevenue, valueColumnRevenue);
	}


}
