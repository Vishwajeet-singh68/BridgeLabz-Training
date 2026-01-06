package RideManagementSystem;

public class Ride implements FareCalculator {
    static double pricePerKilometers=10;
    static int uniqueId=1;
    static boolean isPeak=false;


    private int id;
    double distance;
    private User user;
    private Driver driver;
    private double ridePrice;
    private boolean status;

    public Ride(double distance, User user, Driver driver) {
        this.id = uniqueId++;
        this.distance = distance;
        this.user = user;
        this.driver = driver;
        setRidePrice();
    }

    public int getId(){
        return id;
    }

    public void setRidePrice(){
        ridePrice=distance*pricePerKilometers;

        if(isPeak){
            peak();
        }
    }

    @Override
    public void peak() {
        ridePrice=ridePrice*1.2;
    }

    public void display(){
        System.out.println(user.getName());
        System.out.println(driver.getName());
        System.out.println(distance);
        System.out.println(ridePrice);
    }
}
