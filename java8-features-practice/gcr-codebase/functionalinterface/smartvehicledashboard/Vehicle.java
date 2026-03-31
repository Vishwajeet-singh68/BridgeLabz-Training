package functionalinterface.smartvehicledashboard;

public interface Vehicle {
	void displaySpeed();
	
	default void displayBatteryPercentage() {
		System.out.println("Battery percentage is 100%");
	}
}
