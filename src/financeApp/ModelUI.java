package financeApp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import revenue.Revenue;

public class ModelUI {

	private ObservableList<Revenue> data = FXCollections.observableArrayList();

	public ObservableList<Revenue> getData() {
		return data;
	}

	public void setData(ObservableList<Revenue> data) {
		this.data = data;
	}

	public void addData(Revenue revenue1) {
		data.add(revenue1);
	}
}
