public class ShoppingCartSystem {
    public static void main(String[] args) {
        System.out.println("Shopping Cart System");
		
        // update discount using static method
		Product.updateDiscount(10.0);
		System.out.println("");
		
		// create object
        Product product1 = new Product("Laptop","HP-01",75000,2);
        Product product2 = new Product("Mobile","iPhone-10",65000,1);
		
		
		
        // display product details
        System.out.println("\nProduct1 Details:");
        product1.displayProductDetails();
        System.out.println("");
		
        System.out.println("\nProduct2 Details:");
        product2.displayProductDetails();
        System.out.println("");
		
        // Demonstrate instanceof check
        System.out.println("\nInstanceof Check:");
        if (product1 instanceof Product) {
            System.out.println("product1 is an instance of the Product class.");
			} else {
            System.out.println("product1 is not an instance of the Product class.");
		}
		
        // Modify the discount
        System.out.println("\nUpdating discount to 20%:");
        Product.updateDiscount(20.0);
		
        // Re-display product details after updating discount
        System.out.println("\nProduct 1 Details after Discount Update:");
        product1.displayProductDetails();
		
        System.out.println("\nProduct 2 Details after Discount Update:");
        product2.displayProductDetails();
		
		
	
	
	
    }
	}
	class Product{
    // instance variavbles
    private String productName;
    private final String productId;
    private double price;
    private int quantity;
	
	
    // static variables
    private static double discount =5.0;
	
	
    // paarmeterized constructor
    Product(String productName,String productId, double price,int quantity){
	this.productName = productName;
	this.productId = productId;
	this.price = price;
	this.quantity = quantity;
	System.out.println("A new product has been added" + productName);
    }
    // static method to update discount
    public static void updateDiscount(double newDiscount) {
	discount=newDiscount;
    }
	// method to calculate final price
	public double calculateFinalPrice() {
	double total = price * quantity;
	double discountAmount = total * (discount / 100);
	return total - discountAmount;
	}
    // instance method
    public void displayProductDetails(){
	if(this instanceof Product) {
	System.out.println("Product Name : " + productName);
	System.out.println("Product ID: " + productId);
	System.out.println("Price : " + price);
	System.out.println("Quantity : " + quantity);
	System.out.println("Final Price after " + discount + "% discount: $" + calculateFinalPrice());
	}
	else{
	System.out.println("This is not a object of Product");
	}
    }
	
	}	