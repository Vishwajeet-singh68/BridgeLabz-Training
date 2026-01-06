package questions;

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle class");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("Car class");
    }
}

class Truck extends Vehicle{
    Truck(){
        System.out.println("Truck class");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Vehicle lambo=new Car();
        Vehicle tata=new Truck();
    }
}
