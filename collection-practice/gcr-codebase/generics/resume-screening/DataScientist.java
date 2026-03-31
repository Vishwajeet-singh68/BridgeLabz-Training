package Generics.resumescreening;

public class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
    public void displayRole() {
        System.out.println("Screening for: " + roleName);
    }
}
