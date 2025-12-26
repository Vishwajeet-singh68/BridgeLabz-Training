package encapsulation.employeemanagement;

public class PartTimeEmployee extends Employee{

    static int bonus=5000;

    public PartTimeEmployee(int employeeId, String employeeName, int baseSalary) {
        super(employeeId, employeeName, baseSalary);
    }

    @Override
    public int calculateSalary(){
        return getBaseSalary()+bonus;
    }


}
