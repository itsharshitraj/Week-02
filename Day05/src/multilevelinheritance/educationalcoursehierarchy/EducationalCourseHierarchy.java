package multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create a PaidOnlineCourse object
        PaidOnlineCourse course1 = new PaidOnlineCourse("Java",
                "8 weeks",
                "Udemy",
                true,
                15000,
                12);
        course1.displayInfo();
    }
}
