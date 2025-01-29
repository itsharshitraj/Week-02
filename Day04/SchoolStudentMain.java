import java.util.List;
import java.util.ArrayList;

// Course Class
class Course {
    private String courseName;
    private List<Student> students;  // List of students enrolled in this course
	
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
	}
	
    public String getCourseName() {
        return courseName;
	}
	
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);  // Add this course to the student's enrolled courses
		}
	}
	
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
		}
	}
}

// Student Class
class Student {
    private String name;
    private List<Course> courses;  // List of courses this student is enrolled in
	
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
	}
	
    public String getName() {
        return name;
	}
	
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
		}
	}
	
    public void showCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
		}
	}
}

// School Class
class School {
    private String schoolName;
    private List<Student> students;  // Aggregation of students
	
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
	}
	
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
		}
	}
	
    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
		}
	}
}

public class SchoolStudentMain {
    public static void main(String[] args) {
        // Creating instances of students, courses, and a school
        School school = new School("ABC High School");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
		
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
		
        // Adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);
		
        // Enrolling students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);
		
        // Demonstrating association and aggregation
        school.showStudents();  // Shows all students in the school
        student1.showCourses();  // Shows courses Alice is enrolled in
        student2.showCourses();  // Shows courses Bob is enrolled in
        course1.showStudents();  // Shows all students enrolled in the Math course
        course2.showStudents();  // Shows all students enrolled in the Science course
	}}s	