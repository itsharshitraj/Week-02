import java.util.Scanner;

public class TrackInventory {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter item name: ");
        String itemName = sc.next();
		
        System.out.print("Enter item code: ");
        int itemCode = sc.nextInt();
		
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
		
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
		
        // Create an Item object and display details
        Item item = new Item(itemName, itemCode, price, quantity);
        item.displayDetails();
		
        sc.close();
	}
}

class Item {
    String itemName;
    int itemCode;
    double price;
    int quantity;
	
    // Constructor
    Item(String itemName, int itemCode, double price, int quantity) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
        this.quantity = quantity;
	}
	
    // Method to calculate total cost
	public double totalCost() {
        return quantity * price;
	}
	
    // Method to display details
    public void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
	}
}
