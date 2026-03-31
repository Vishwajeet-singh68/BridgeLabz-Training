package encapsulation.employeemanagement;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(123, "Vishwajeet Singh", 50_000);
        emp1.assignDepartment("support");
        Employee emp2 = new PartTimeEmployee(122,"Amit kumar rai", 40_000);
        emp2.assignDepartment("developoer intern");
        emp1.displayDetail();
    }
}
