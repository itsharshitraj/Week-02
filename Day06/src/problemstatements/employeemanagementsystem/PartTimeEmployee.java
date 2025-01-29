package problemstatements.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String departmentName;

    // Constructor
    public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
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
        System.out.println("Work Hours: " + workHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Calculated Salary: $" + calculateSalary());
        System.out.println(getDepartmentDetails());
    }
}