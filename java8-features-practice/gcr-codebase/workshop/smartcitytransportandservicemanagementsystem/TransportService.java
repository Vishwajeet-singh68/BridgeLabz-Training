package smartcitytransportandservicemanagementsystem;

public interface TransportService {
    String getName();
    double getFare();
    String getRoute();
    String getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getName() + " | Route: " + getRoute() + " | Fare: " + getFare());
    }
}

