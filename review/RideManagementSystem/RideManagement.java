package RideManagementSystem;

import java.util.*;

public class RideManagement {
    HashMap<Integer, Ride> allRides;
    PriorityQueue<Driver> nearestDriver;

    RideManagement(){
        this.allRides=new HashMap<>();
        this.nearestDriver=new PriorityQueue<>((a,b)->Double.compare(a.getDistanceFromUser(),b.getDistanceFromUser()));
    }

    public void bookRide(User user, int distance) throws NoDriverAvailableException {
        Stack<Driver> stack = new Stack<>();

        while (!nearestDriver.isEmpty()) {
            Driver driver = nearestDriver.poll();
            stack.push(driver);

            if (driver.getAvailability()) {

                Ride newRide = new Ride(distance, user, driver);
                allRides.put(newRide.getId(), newRide);

                driver.changeAvailability();

                while (!stack.isEmpty()) {
                    nearestDriver.add(stack.pop());
                }

                System.out.println("Ride booked");
                return;
            }
        }
        while (!stack.isEmpty()) {
            nearestDriver.add(stack.pop());
        }
        throw new NoDriverAvailableException("No Drivers Available");
    }

    public void displayAllRides(){
        for(int i:allRides.keySet()){
            Ride r=allRides.get(i);
            r.display();

        }
    }

}
