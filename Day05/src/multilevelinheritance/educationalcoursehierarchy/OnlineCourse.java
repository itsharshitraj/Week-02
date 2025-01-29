package multilevelinheritance.educationalcoursehierarchy;

class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;

    OnlineCourse(String courseName, String duration, String platform, boolean isRecorded){
        super(courseName,duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    // method to display online course information
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform : " + platform);
        System.out.println("isRecorded: " + (isRecorded ? "Yes" : "No"));
    }
}