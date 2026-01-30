package streamapi;
import java.util.*;
import java.util.stream.Collectors;

class Doctor {
    int id;
    String name;
    String specialty;
    boolean weekendAvailability;

    public Doctor(int id, String name, String specialty, boolean weekendAvailability) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailability = weekendAvailability;
    }
}

public class HospitalDoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor(1, "Dr. Sharma", "Cardiology", true),
            new Doctor(2, "Dr. Singh", "Orthopedics", false),
            new Doctor(3, "Dr. Mehta", "Neurology", true),
            new Doctor(4, "Dr. Verma", "Dermatology", true),
            new Doctor(5, "Dr. Patel", "Cardiology", false),
            new Doctor(6, "Dr. Rao", "Pediatrics", true),
            new Doctor(7, "Dr. Gupta", "Orthopedics", true),
            new Doctor(8, "Dr. Khan", "ENT", false),
            new Doctor(9, "Dr. Das", "Neurology", true),
            new Doctor(10, "Dr. Iyer", "General", true)
        );

        List<Doctor> availableDoctors = doctors.stream()
            .filter(d -> d.weekendAvailability)
            .sorted((a,b)->a.specialty.compareTo(b.specialty))
            .collect(Collectors.toList());

        System.out.println("Doctors available on weekends (sorted by specialty):");
        availableDoctors.forEach(d ->
            System.out.println(d.id + " | " + d.name + " | " + d.specialty)
        );
    }
}
