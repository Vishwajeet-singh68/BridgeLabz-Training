package encapsulation.vehicalrentalsystem;

public class Bike extends Vehicle {

    public Bike(double rentalRate, String vehicalNumber,String policy) {
        super(rentalRate, "BIKE", vehicalNumber,policy);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days * 0.9;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * rentalRate;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number:"+getInsurancePolicyNumber());
    }
}
