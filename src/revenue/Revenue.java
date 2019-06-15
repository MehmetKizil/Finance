package revenue;

import javafx.beans.property.SimpleStringProperty;

public class Revenue {

	private SimpleStringProperty name;
	private SimpleStringProperty value;

	public Revenue() {

	}

	public Revenue(String name, String value) {
		this.name = new SimpleStringProperty(name);
		this.value = new SimpleStringProperty(value);
	}

	public SimpleStringProperty getName() {
		return name;
	}

	public void setName(SimpleStringProperty name) {
		this.name = name;
	}

	public SimpleStringProperty getValue() {
		return value;
	}

	public void setValue(SimpleStringProperty value) {
		this.value = value;
	}
}
