package RideManagementSystem;

public class Main {
    public static void main(String[] args) {
        RideManagement rideManager=new RideManagement();
        User vishwajeet=new User("vishwajeet");

        Driver d=new Driver("someone",3);
        rideManager.nearestDriver.add(d);

        try {
            rideManager.bookRide(vishwajeet, 6);
        }
        catch (NoDriverAvailableException e){
            e.printStackTrace();
        }

        rideManager.displayAllRides();

        User amit=new User("amit");
        try{
            rideManager.bookRide(amit, 10);
        } catch (NoDriverAvailableException e) {
            e.printStackTrace();
        }
    }
}
