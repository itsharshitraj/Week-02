package problemstatements.employeemanagementsystem;
import java.util.ArrayList;
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list of employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Add employees to the list
        FullTimeEmployee fte = new FullTimeEmployee("101", "Harshit", 40000, "Engineering",60000);
        fte.assignDepartment("Engineering");
        employees.add(fte);

        PartTimeEmployee pte = new PartTimeEmployee("102", "Gautam", 20000, 25, 20);
        pte.assignDepartment("Support");
        employees.add(pte);

        // Display employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Total Salary: $" + emp.calculateSalary());
            System.out.println("----------------------");
        }
    }
}
