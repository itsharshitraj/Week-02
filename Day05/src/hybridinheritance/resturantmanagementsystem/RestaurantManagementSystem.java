package hybridinheritance.resturantmanagementsystem;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create objects for Chef and Waiter
        Chef chef = new Chef("Alice", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Bob", 102, 5);

        // Display information and perform duties
        System.out.println("Restaurant Staff:");
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
