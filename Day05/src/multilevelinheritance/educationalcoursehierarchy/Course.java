package multilevelinheritance.educationalcoursehierarchy;

class Course {
    protected String courseName;
    protected String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // method to display course information
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration );
    }
}