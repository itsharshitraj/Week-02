package problemstatements.ecommerceplatform;

class Groceries extends Product implements Taxable {
    private boolean isStaple;

    public Groceries(String productId, String name, double price, boolean isStaple) {
        super(productId, name, price);
        this.isStaple = isStaple;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate on Grocery is 18%";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("isStaple: " + (isStaple ? "Yes" : "No"));
    }
}
