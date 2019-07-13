package entry;

import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ControllerEntry implements Initializable {

	@FXML
	private TextField nameField;
	@FXML
	private TextField valueField;
	
	private ObservableList<Entry> observableRevenueList;
	private ObservableList<Entry> observableOutgoingList;
	
	boolean entryType;

	Main main;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	@FXML
	public void saveAndClose(ActionEvent saveAndClosEvent) {
		if (entryType) {
		try {
			Entry revenue = new Entry(nameField.getText(), Double.parseDouble(valueField.getText()));
			observableRevenueList.add(revenue);
			main.closeEntry();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}else {
		try {
			Entry outgoing = new Entry(nameField.getText(), Double.parseDouble(valueField.getText()));
			observableOutgoingList.add(outgoing);
			main.closeEntry();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
	
	public void setMain(Main main) {
		this.main = main;
	}

	public void setObservableRevenueList(ObservableList<Entry> observableRevenueList) {
        this.observableRevenueList = observableRevenueList;
    }	
	
	public void setObservableOutgoingList(ObservableList<Entry> observableOutgoingList) {
        this.observableOutgoingList = observableOutgoingList;
    }
	
	public void setEntryType (boolean entryType) {
		this.entryType = entryType;
	}
}