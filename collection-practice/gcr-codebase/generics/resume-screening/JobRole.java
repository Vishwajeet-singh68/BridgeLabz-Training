package Generics.resumescreening;

public abstract class JobRole {
    String roleName;
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public abstract void displayRole();
}
