
import java.util.ArrayList;

// Employee class
class Employee {
    private String name;
    private int employeeId;
	
    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
	}
	
    // Getter methods
    public String getName() {
        return name;
	}
	
    public int getEmployeeId() {
        return employeeId;
	}
	
    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
	}
}

// Department class
class Department {
    public String name;
    private ArrayList<Employee> employees;
	
    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
	}
	
    // Method to add an employee to the department
    public void addEmployee(String name, int employeeId) {
        Employee employee = new Employee(name, employeeId);
        employees.add(employee);
	}
	
    // Method to display all employees in the department
    public void displayEmployees() {
        System.out.println("Department: " + name);
        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
			} else {
            for (Employee employee : employees) {
                employee.displayEmployee();
			}
		}
	}
}

// Company class
class Company {
    private String name;
    private ArrayList<Department> departments;
	
    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
	}
	
    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
	}
	
    // Method to add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName, int employeeId) {
        for (Department department : departments) {
            if (departmentName.equals(department.name)) {
                department.addEmployee(employeeName, employeeId);
                return;
			}
		}
        System.out.println("Department " + departmentName + " not found.");
	}
	
    // Method to display all departments and their employees
    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        if (departments.isEmpty()) {
            System.out.println("No departments in the company.");
			} else {
            for (Department department : departments) {
                department.displayEmployees();
                System.out.println();
			}
		}
	}
}

// Main class
public class CompanyComposition {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Tech Innovators");
		
        // Add departments to the company
        company.addDepartment("Engineering");
        company.addDepartment("Human Resources");
        company.addDepartment("Marketing");
		
        // Add employees to departments
        company.addEmployeeToDepartment("Engineering", "Alice", 101);
        company.addEmployeeToDepartment("Engineering", "Bob", 102);
        company.addEmployeeToDepartment("Human Resources", "Charlie", 201);
        company.addEmployeeToDepartment("Marketing", "Daisy", 301);
		
        // Display the company structure
        company.displayCompanyStructure();
		
        // Simulate deleting the company
        System.out.println("\nDeleting the company...");
        company = null; // This will also effectively delete all departments and employees.
	}
}

