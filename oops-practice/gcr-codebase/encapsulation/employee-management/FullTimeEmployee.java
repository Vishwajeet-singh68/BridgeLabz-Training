package encapsulation.employeemanagement;

public class FullTimeEmployee extends Employee {

    static int bonus=10000;

    public FullTimeEmployee(int employeeId, String employeeName, int baseSalary) {
        super(employeeId,employeeName,baseSalary);
    }

    @Override
    public int calculateSalary(){
        return getBaseSalary()+bonus;
    }
}
