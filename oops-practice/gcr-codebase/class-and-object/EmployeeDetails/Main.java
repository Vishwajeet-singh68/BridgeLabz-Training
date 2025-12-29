public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("Alice", 101, 75000);
        Employee emp2=new Employee("Bob", 102, 85000);  
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();
        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}