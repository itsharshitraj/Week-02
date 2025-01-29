import java.util.ArrayList;

class University {
    private String name;
    private ArrayList<Department> departments; // Composition relationship
	
    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
	}
	
    // Method to add a department
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
	}
	
    // Display all departments
    public void displayDepartments() {
        System.out.println(this.name + " departments:");
        for (Department department : departments) {
            System.out.println(department.getName());
		}
	}
	
    // Add a faculty to a department
    public void addFacultyToDepartment(String departmentName, Faculty faculty) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addFaculty(faculty);
			}
		}
	}
	
    // Display faculties in a department
    public void displayFacultiesInDepartment(String departmentName) {
        for (Department department : departments) {
            if (department.name.equals(departmentName)) {
                department.displayFaculties();
			}
		}
	}
	
    // Delete the university (clears all departments)
    public void deleteUniversity() {
        departments.clear(); // All departments are removed
        System.out.println(this.name + " and all its departments have been deleted.");
	}
	
    // Inner class for Department to enforce composition
    private class Department {
        private String name;
        private ArrayList<Faculty> faculties; // Aggregation relationship
		
        Department(String name) {
            this.name = name;
            this.faculties = new ArrayList<>();
		}
		
        public String getName() {
            return name;
		}
		
        public void addFaculty(Faculty faculty) {
            this.faculties.add(faculty);
		}
		
        public void displayFaculties() {
            System.out.println(this.name + " faculties:");
            for (Faculty faculty : faculties) {
                System.out.println(faculty.getName());
			}
		}
	}
}

class Faculty {
    private String name;
	
    Faculty(String name) {
        this.name = name;
	}
	
    public String getName() {
        return name;
	}
}

public class UniversityMain {
    public static void main(String[] args) {
        // Create a university
        University university = new University("ABC University");
		
        // Add departments
        university.addDepartment("Maths");
        university.addDepartment("Physics");
		
        // Display departments
        university.displayDepartments();
		
        // Create faculties
        Faculty faculty1 = new Faculty("Dr. Neeraj");
        Faculty faculty2 = new Faculty("Dr. Harshit");
		
        // Add faculties to departments
        university.addFacultyToDepartment("Maths", faculty1);
        university.addFacultyToDepartment("Maths", faculty2);
        university.addFacultyToDepartment("Physics", faculty2);
		
        // Display faculties in departments
        university.displayFacultiesInDepartment("Maths");
        university.displayFacultiesInDepartment("Physics");
	
	// Delete the university
	university.deleteUniversity();
	university = null; // Make the university object eligible for garbage collection
	
	// At this point, departments are inaccessible because they are encapsulated
	System.out.println("University object has been deleted.");
    }
	}	