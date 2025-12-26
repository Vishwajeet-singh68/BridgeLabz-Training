package encapsulation.vehicalrentalsystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(2000, "CAR123", "POL1234567"));
        vehicles.add(new Bike( 800, "BIK222", "POL7777888"));
        vehicles.add(new Truck(3500, "TRK999", "POL4444555"));

        int days = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.type + " (" + v.vehicleNumber + ")");
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));
            System.out.println("Insurance Cost: " + v.calculateInsurance());
            v.getInsuranceDetails();
            System.out.println("-----------------------------------");
        }
    }
}
