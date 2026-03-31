package RideManagementSystem;

public class User {
    static int uniqueId=1;

    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User(String name){
        this.id=uniqueId++;
        this.name=name;
    }
}
