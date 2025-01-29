import java.util.ArrayList;

// Product class
class Product {
    private String name;
    private double price;
	
    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
	}
	
    public String getName() {
        return name;
	}
	
    public double getPrice() {
        return price;
	}
	
    @Override
    public String toString() {
        return "Product{" +
		"name='" + name + '\'' +
		", price=" + price +
		'}';
	}
}

// Order class
class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;
	
    // Constructor
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
	}
	
    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
	}
	
    // Calculate the total price of the order
    public double calculateTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
		}
        return total;
	}
	
    // Display the order details
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("  " + product);
		}
        System.out.println("Total: $" + calculateTotal());
	}
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Order> orders;
	
    // Constructor
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
	}
	
    public String getName() {
        return name;
	}
	
    // Place an order
    public void placeOrder(Order order) {
        orders.add(order);
	}
	
    // Display all orders placed by the customer
    public void displayOrders() {
        System.out.println("Customer: " + name + " - Orders:");
        for (Order order : orders) {
            order.displayOrder();
		}
	}
}

// Main class
public class Ecommerce {
    public static void main(String[] args) {
        // Create some products
        Product laptop = new Product("Laptop", 1000.00);
        Product smartphone = new Product("Smartphone", 700.00);
        Product headphones = new Product("Headphones", 200.00);
		
        // Create a customer
        Customer customer = new Customer("Alice");
		
        // Create an order
        Order order1 = new Order(1, customer);
        order1.addProduct(laptop);
        order1.addProduct(headphones);
		
        // Add the order to the customer
        customer.placeOrder(order1);
	
	// Create another order
	Order order2 = new Order(2, customer);
	order2.addProduct(smartphone);
	
	// Add the second order to the customer
	customer.placeOrder(order2);
	
	// Display all orders for the customer
	customer.displayOrders();
    }
	}
		