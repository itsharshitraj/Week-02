package hybridinheritance.resturantmanagementsystem;

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    // Constructor
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}