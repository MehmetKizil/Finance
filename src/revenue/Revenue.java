package revenue;

public class Revenue {

	private String name;
	private double value;
	
	public Revenue() {
		
	}
	
	public Revenue(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
































//package revenue;
//
//import javafx.beans.property.SimpleStringProperty;
//
//public class Revenue {
//
//	private SimpleStringProperty name;
//	private SimpleStringProperty value;
//
//	public Revenue() {
//
//	}
//
//	public Revenue(String name, String value) {
//		this.name = new SimpleStringProperty(name);
//		this.value = new SimpleStringProperty(value);
//	}
//
//	public SimpleStringProperty getName() {
//		return name;
//	}
//
//	public void setName(SimpleStringProperty name) {
//		this.name = name;
//	}
//
//	public SimpleStringProperty getValue() {
//		return value;
//	}
//
//	public void setValue(SimpleStringProperty value) {
//		this.value = value;
//	}
//}
