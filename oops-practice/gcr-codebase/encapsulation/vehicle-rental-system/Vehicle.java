package encapsulation.vehicalrentalsystem;

public abstract class Vehicle implements Insurable {
    String vehicleNumber;
    String type;
    double rentalRate;

    private final String insurancePolicyNumber;

    public Vehicle(double rentalRate, String type, String vehicleNumber, String policy) {
        this.rentalRate = rentalRate;
        this.type = type;
        this.vehicleNumber = vehicleNumber;
        this.insurancePolicyNumber=policy;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }


    abstract double calculateRentalCost(int days);
}
