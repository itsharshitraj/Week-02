package problemstatements.onlinefooddeliverysystem;

public class Main {
    public static void main(String[] args) {
        // Create food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 10.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 12.0, 3);

        // Add items to an array
        FoodItem[] foodItems = {vegItem, nonVegItem};

        // Process and display food items
        System.out.println("Order Details:");
        for (FoodItem item : foodItems) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10.0); // Apply 10% discount
                System.out.println(discountableItem.getDiscountDetails());
            }

            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);
            System.out.println("----------------------");
        }
    }
}
