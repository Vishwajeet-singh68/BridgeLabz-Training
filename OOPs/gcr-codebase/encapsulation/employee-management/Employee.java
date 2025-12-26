package encapsulation.employeemanagement;

abstract class Employee implements Department {
    private int employeeId;
    private String employeeName;
    private int baseSalary;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    private String departmentName;

    public Employee(int employeeId, String employeeName, int baseSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.baseSalary=baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String getDepartmentDetails() {
        return departmentName;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName=departmentName;
    }

    abstract int calculateSalary();

    public void displayDetail(){
        System.out.println("employee id:"+employeeId);
        System.out.println("employee name:"+employeeName);
        System.out.println("employee salary:"+calculateSalary());
        System.out.println("employee Department:"+getDepartmentDetails());
    }
}
