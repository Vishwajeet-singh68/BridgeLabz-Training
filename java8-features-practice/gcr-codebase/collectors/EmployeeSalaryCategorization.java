package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Amit", "IT", 60000),
            new Employee("Rahul", "HR", 45000),
            new Employee("Priya", "IT", 75000),
            new Employee("Neha", "Finance", 80000),
            new Employee("Rohit", "HR", 50000),
            new Employee("Anjali", "IT", 90000),
            new Employee("Karan", "Finance", 70000),
            new Employee("Sneha", "HR", 48000),
            new Employee("Pooja", "IT", 65000),
            new Employee("Vikas", "Finance", 85000)
        );

        
        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(e -> e.department,Collectors.averagingDouble(e -> e.salary)));

        System.out.println("Average Salary by Department:");
        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " : " + avg)
        );
    }
}

