package Generics.resumescreening;
import java.util.*;
public class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) {
        this.role = role;
    }
    public void processResume() {
        role.displayRole();
    }
    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            role.displayRole();
        }
    }
}
