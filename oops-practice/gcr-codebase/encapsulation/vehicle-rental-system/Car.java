package encapsulation.vehicalrentalsystem;

public class Car extends Vehicle {
    public Car(double rentalRate, String vehicleNumber, String policy) {
        super(rentalRate, "CAR", vehicleNumber,policy);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days + 500;
    }


    @Override
    public double calculateInsurance() {
        return 0.10 * rentalRate;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number:"+getInsurancePolicyNumber());
    }
}
