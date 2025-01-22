import java.lang.*;
public class EmployeeDetails{
	public static void main(String args[]){
		Employee employee = new Employee("Harshit",59,25000);
		employee.displayDetails();
		
		
	}}	
	class Employee{
	    String name;
		int id;
		double salary;
		
		// constructor
		Employee(String name,int id,double salary){
			this.name=name;
			this.id=id;
			this.salary=salary;
			
		}
		// method to display employee details
		void displayDetails(){
			System.out.println("Name: " + name + ", Id: " + id + ", Salary: " +salary);
			
		}
	}
	
	
		