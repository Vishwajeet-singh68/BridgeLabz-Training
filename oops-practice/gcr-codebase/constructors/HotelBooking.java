// Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    //default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    //copy constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    //parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking: " + defaultBooking.guestName + ", " + defaultBooking.roomType + ", " + defaultBooking.nights + " night(s)");

        HotelBooking parameterizedBooking = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("Parameterized Booking: " + parameterizedBooking.guestName + ", " + parameterizedBooking.roomType + ", " + parameterizedBooking.nights + " night(s)");

        HotelBooking copiedBooking = new HotelBooking(parameterizedBooking);
        System.out.println("Copied Booking: " + copiedBooking.guestName + ", " + copiedBooking.roomType + ", " + copiedBooking.nights + " night(s)");
    }
}
