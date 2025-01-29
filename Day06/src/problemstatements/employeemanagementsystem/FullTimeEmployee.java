package problemstatements.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String departmentName;

    public FullTimeEmployee(String employeeId, String name, double baseSalary,String departmentName, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;

    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fixed Salary: $" + fixedSalary);
        System.out.println(getDepartmentDetails());
    }
}



