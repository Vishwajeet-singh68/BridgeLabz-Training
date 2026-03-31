package encapsulation.vehicalrentalsystem;

public class Truck extends Vehicle {

    public Truck(double rentalRate, String vehicleNumber, String policy) {
        super(rentalRate, "TRUCK", vehicleNumber, policy);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days * 0.9;
    }


    @Override
    public double calculateInsurance() {
        return 0.15 * rentalRate;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number:"+getInsurancePolicyNumber());
    }
}
