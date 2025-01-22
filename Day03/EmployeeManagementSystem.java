public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // display company name using static method
        Employee.displayCompanyName();
        System.out.println("");
		
        Employee employee1 = new Employee("John", "011-01","SDE-1");
        employee1.displayEmployeeDetails();
        System.out.println("");
		
        Employee employee2 = new Employee("Harshit","011-02","SDE-2");
        employee2.displayEmployeeDetails();
        System.out.println("");
		
        // display total employee using static method
        Employee.displayTotalEmployees();
	}
}
class Employee{
    // static variables
    private static String companyName="Capegemini";
    private static int totalEmployees=0;
	
    //instance variables
    private String name;
    private final String id;
    private String designation;
	
    // constructor
    public Employee(String name, String id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
	}
    // static method to display Company name
    public static void displayCompanyName(){
        System.out.println("Company Name :" + companyName);
	}
    // static methods to display total employee
    public static void displayTotalEmployees(){
        System.out.println("Total employee : " + totalEmployees);
	}
    // method to display employee details
    public void displayEmployeeDetails(){
	if(this instanceof Employee){
	System.out.println("Name : " + name);
	System.out.println("Id : " + id);
	System.out.println("Designation : " + designation);
	} else {
	System.out.println("This is not an object of Employee class");
	}
    }
	}	