package functionalinterface.smartvehicledashboard;

public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		bike .displayBatteryPercentage();
		car.displayBatteryPercentage();
	}
}
