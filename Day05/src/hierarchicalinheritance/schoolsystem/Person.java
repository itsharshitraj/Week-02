package hierarchicalinheritance.schoolsystem;


// Superclass: Person
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display general information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Placeholder for role-specific information
    public void displayRole() {
        System.out.println("General Person");
    }
}