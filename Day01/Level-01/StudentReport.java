import java.util.*;
public class StudentReport{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name of Student");
		String name = sc.next();
		
		System.out.println("Enter roll number of Student");
		int rollNumber = sc.nextInt();
		
		System.out.println("Enter marks of Student");
		int marks = sc.nextInt();
		
		Student student =  new Student(name,rollNumber,marks);
		student.displayDetails();
		
	}}
	
	class Student{
		String name;
		int rollNumber;
		int marks;
		
		// constructor
		Student(String name,int rollNumber,int marks){
			this.name=name;
			this.rollNumber=rollNumber;
			this.marks=marks;
		}
		// method to calculate grade based on marks
		
		public String gradeCalculation(){
			if(marks>=90){
				return "A";
				}else if (marks >= 80) {
				return "B";
				} else if (marks >= 70) {
				return "C";
				} else if (marks >= 60) {
				return "D";
				} else {
				return "F";
			}
			
		}
		
		
		// method to display details
		void displayDetails(){
			System.out.println("Name :"+name);
		    System.out.println("rollNumber :"+rollNumber);
			System.out.println("marks :"+marks);
			System.out.println("grade :"+gradeCalculation());
		}
	}		