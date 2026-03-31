package CSVtoObject;

public class Employee {
    private int id;
    private String name;
    private String departemt;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartemt() {
        return departemt;
    }

    public void setDepartemt(String departemt) {
        this.departemt = departemt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return id+" "+name+" "+departemt+" "+salary;
    }
}
