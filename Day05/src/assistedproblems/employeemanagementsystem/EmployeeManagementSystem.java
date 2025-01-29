package assistedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        System.out.println("Employee ");
        Employee employee = new Employee("Harshit",121,25000);
        employee.displayDetails();
        System.out.println();

        System.out.println("Manager");
        Manager manager = new Manager("rox",101,10000,5);
        manager.displayDetails();
        System.out.println();

        System.out.println("Dveloper");
        Developer developer = new Developer("jack",111,140000,"java");
        developer.displayDetails();
        System.out.println();

        System.out.println("Intern");
        Intern intern = new Intern("rack",109,150000,"Full Stack");
        intern.displayDetails();
        System.out.println();

    }
}
