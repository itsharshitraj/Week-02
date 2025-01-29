package problemstatements.ecommerceplatform;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // list of products
        ArrayList<Product> products = new ArrayList<Product>();

        Electronics electronics = new Electronics("i-x5", "Iphone-15", 65000, 2);
        products.add(electronics);

        Clothing clothing = new Clothing("xl6", "T-shirts", 500, "M");
        products.add(clothing);

        Groceries groceries = new Groceries("5484", "Rice", 650, true);
        products.add(groceries);

        System.out.println("Product Details with Final Prices");
        for (Product product : products) {
            product.displayDetails();

            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: $" + discount);
            System.out.println("Tax: $" + tax);
            System.out.println("Final Price: $" + finalPrice);

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("----------------------");
        }

    }
}
