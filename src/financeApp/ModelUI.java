package financeApp;

import entry.Entry;
import javafx.collections.ObservableList;

public class ModelUI {
	
	double sumRev = 0;
	double sumOut = 0;
	
	public double sumRevenue(ObservableList<Entry> observableRevenueList) {
		if (sumRev == 0) {
			for (Entry revenueEntry : observableRevenueList) {
				sumRev = sumRev + revenueEntry.getValue();
			}
			return sumRev;
		}else {
			sumRev = 0;
			for (Entry revenueEntry : observableRevenueList) {
				sumRev = sumRev + revenueEntry.getValue();
			}
			return sumRev;
		}
	}
	public double sumOutgoing(ObservableList<Entry> observableOutgoingList) {
		if (sumOut == 0) {
			for (Entry outgoingEntry : observableOutgoingList) {
				sumOut = sumOut + outgoingEntry.getValue();
			}
			return sumOut;
		}else {
			sumOut = 0;
			for (Entry outgoingEntry : observableOutgoingList) {
				sumOut = sumOut + outgoingEntry.getValue();
			}
		return sumOut;
		}
	}
}