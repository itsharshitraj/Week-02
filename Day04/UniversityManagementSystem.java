import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;
	
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
	}
	
    public void assignProfessor(Professor professor) {
        this.professor = professor;
	}
	
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            
		}
	}
	
    public String getCourseName() {
        return courseName;
	}
	
    public Professor getProfessor() {
        return professor;
	}
	
    public List<Student> getStudents() {
        return students;
	}
	
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
			} else {
            System.out.println("Professor: Not Assigned");
		}
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
		}
	}
}

class Professor {
    private String name;
    private List<Course> courses;
	
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
	}
	
    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);
		}
	}
	
    public String getName() {
        return name;
	}
	
    public List<Course> getCourses() {
        return courses;
	}
}

class Student {
    private String name;
    private List<Course> courses;
	
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
	}
	
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);
		}
	}
	
    public String getName() {
        return name;
	}
	
    public List<Course> getCourses() {
        return courses;
	}
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
		
        Professor professor1 = new Professor("Dr. Raghav");
        Professor professor2 = new Professor("Dr. Harsh");
		
        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");
		
        // Assign professors 
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);
		
		
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
		
        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
		
        // Display course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
		
        // Display student enrollments
        System.out.println("\nCourses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println("  - " + course.getCourseName());
		}
		
        System.out.println("\nCourses taught by " + professor1.getName() + ":");
        for (Course course : professor1.getCourses()) {
            System.out.println("  - " + course.getCourseName());
		}
	}
}