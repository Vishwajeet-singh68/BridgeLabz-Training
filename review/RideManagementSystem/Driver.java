package RideManagementSystem;

public class Driver {
    static int uniqueId=1;

    private int id;
    private String name;
    private double distanceFromUser;
    private boolean available;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getDistanceFromUser(){
        return distanceFromUser;
    }

    public boolean getAvailability(){
        return available;
    }

    public void changeAvailability(){
        available=!available;
    }

    public Driver(String name,double distanceFromUser) {
        this.id = uniqueId++;
        this.name = name;
        this.distanceFromUser=distanceFromUser;
        available=true;
    }
}
