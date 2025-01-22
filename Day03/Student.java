class Student {
    // Static variable for the university name shared by all students
    private static String universityName = "Global University";
	
    // Static variable to keep track of the total number of students
    private static int totalStudents = 0;
	
    // Final variable to ensure rollNumber cannot be changed
    private final int rollNumber;
	
    // Instance variables
    private String name;
    private String grade; // Changed to String to support multi-character grades
	
    // Constructor
    public Student(int rollNumber, String name, String grade) {
        // Using 'this' to initialize instance variables
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
		
        // Increment total students when a new student is created
        totalStudents++;
	}
	
    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
	}
	
    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) { // Using 'instanceof' to validate object type
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
			} else {
            System.out.println("The object is not an instance of the Student class.");
		}
	}
	
    // Method to update the grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) { // Using 'instanceof' to validate object type
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
			} else {
            System.out.println("The object is not an instance of the Student class.");
		}
	}
	
    // Main method to test the Student class
    public static void main(String[] args) {
        // Display the university name
        System.out.println("University Name: " + universityName);
		
        // Create Student objects
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");
		
        // Display details of students
        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails();
		
        System.out.println("\nStudent 2 Details:");
        student2.displayStudentDetails();
		
        // Display the total number of students
        System.out.println("\nTotal Students:");
        Student.displayTotalStudents();
		
        // Update grade for a student
        System.out.println("\nUpdating Grade:");
        student1.updateGrade("A+");
		
        // Display details again after grade update
        System.out.println("\nStudent 1 Details After Grade Update:");
        student1.displayStudentDetails();
		
        // Instanceof demonstration
        System.out.println("\nInstanceof Check:");
        if (student1 instanceof Student) {
            System.out.println("student1 is an instance of the Student class.");
			} else {
            System.out.println("student1 is not an instance of the Student class.");
		}
	}
}
