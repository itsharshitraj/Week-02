import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;
	
    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
	}
	
    // Getters
    public String getItemName() {
        return itemName;
	}
	
    public double getPrice() {
        return price;
	}
	
    public int getQuantity() {
        return quantity;
	}
	
    // Calculate total cost for this item
    public double getTotalCost() {
        return price * quantity;
	}
}

class ShoppingCart {
    private ArrayList<CartItem> cartItems;
	
    // Constructor to initialize the cart
    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
	}
	
    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cartItems.add(item);
        System.out.println(quantity + " x " + itemName + " added to the cart.");
	}
	
    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " removed from the cart.");
                return;
			}
		}
        System.out.println("Item not found in the cart.");
	}
	
    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
		}
        System.out.println("Total Cost: $" + totalCost);
	}
	
    // Method to display cart details
    public void displayCartDetails() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
		}
		
        System.out.println("Cart Items:");
        for (CartItem item : cartItems) {
            System.out.println(item.getQuantity() + " x " + item.getItemName() + " @ $" + item.getPrice() + " each - Total: $" + item.getTotalCost());
		}
        displayTotalCost();
	}
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
		
        while (true) {
            System.out.println("\nShopping Cart System:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart Details");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
			
            switch (choice) {
                case 1:
				System.out.print("Enter item name: ");
				sc.nextLine(); // Consume newline
				String itemName = sc.nextLine();
				System.out.print("Enter item price: ");
				double price = sc.nextDouble();
				System.out.print("Enter item quantity: ");
				int quantity = sc.nextInt();
				cart.addItem(itemName, price, quantity);
				break;
				
                case 2:
				System.out.print("Enter item name to remove: ");
				sc.nextLine(); // Consume newline
				String itemToRemove = sc.nextLine();
				cart.removeItem(itemToRemove);
				break;
				
                case 3:
				cart.displayCartDetails();
				break;
				
                case 4:
				cart.displayTotalCost();
				break;
				
                case 5:
				System.out.println("Exiting the system. Thank you!");
				sc.close();
				return;
				
                default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}
}
