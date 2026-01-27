package functionalinterface.smartvehicledashboard;

public class Car implements Vehicle {
	int battery = 95;

	@Override
	public void displaySpeed() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void displayBatteryPercentage() {
		System.out.println("Battery percentage is "+battery+"%");
	}
	
}
