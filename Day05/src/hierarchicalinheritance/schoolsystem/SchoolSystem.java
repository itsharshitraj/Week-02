package hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 45, "Administration");

        // Display information for each role
        System.out.println("School Roles:");
        teacher.displayRole();
        teacher.displayInfo();
        System.out.println();

        student.displayRole();
        student.displayInfo();
        System.out.println();

        staff.displayRole();
        staff.displayInfo();
    }
}
