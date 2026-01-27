package functionalinterface.markerinterface;

class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}

public class CloneableMain{
	public static void main(String[] args) throws CloneNotSupportedException {

        Employee original = new Employee(1, "Vishwajeet");
        Employee copy = (Employee) original.clone();

        System.out.println(original == copy); // false: because of downcasting the new memory assigned to the copy
        System.out.println(original.name.equals(copy.name)); // true
    }
}

