package financeApp;

import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import entry.Entry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControllerUI implements Initializable{
	
	private Main mainUI;
	@FXML
	private TableView<Entry> listRevenue;
	@FXML
	private TableColumn<Entry, String> nameColumnRevenue;
	@FXML
	private TableColumn<Entry, String> valueColumnRevenue;
	@FXML
	private TableView<Entry> listOutgoing;
	@FXML
	private TableColumn<Entry, String> nameColumnOutgoing;
	@FXML
	private TableColumn<Entry, String> valueColumnOutgoing;
	@FXML
	private Label sumRevenueLabel;
	@FXML
	private Label sumOutgoingLabel;
	@FXML
	private Button sumButton;
	
	ModelUI modelUI = new ModelUI();
	
	private ObservableList<Entry> revenues = FXCollections.observableArrayList();
	private ObservableList<Entry> outgoingList = FXCollections.observableArrayList();

	@FXML
	public void addRevenue(ActionEvent revenueEvent) {
		try {
			mainUI.startEntry(revenues, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void addOutgoing (ActionEvent outgoingEvent) {
		try {
			mainUI.startEntry(outgoingList, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void setSumLabel(ActionEvent sumEvent) {
		try {
			sumRevenueLabel.setText(Double.toString(modelUI.sumRevenue(revenues)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void setSumOutLabel(ActionEvent sumOutgoingEvent) {
		try {
			sumOutgoingLabel.setText(Double.toString(modelUI.sumOutgoing(outgoingList)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nameColumnRevenue.setCellValueFactory(new PropertyValueFactory<>("name"));
		valueColumnRevenue.setCellValueFactory(new PropertyValueFactory<>("value"));
		nameColumnOutgoing.setCellValueFactory(new PropertyValueFactory<>("name"));
		valueColumnOutgoing.setCellValueFactory(new PropertyValueFactory<>("value"));
		listRevenue.setItems(revenues);
		listOutgoing.setItems(outgoingList);
	}
	
	public void setMainUI(Main mainUI) {
		this.mainUI = mainUI;
	}	
}