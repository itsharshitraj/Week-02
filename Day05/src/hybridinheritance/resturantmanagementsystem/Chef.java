package hybridinheritance.resturantmanagementsystem;

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing meals specializing in " + specialty + ".");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}