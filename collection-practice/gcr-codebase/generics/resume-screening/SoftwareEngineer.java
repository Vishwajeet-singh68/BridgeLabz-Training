package Generics.resumescreening;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
    public void displayRole() {
        System.out.println("Screening for: " + roleName);
    }
}
