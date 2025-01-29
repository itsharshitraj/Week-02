package problemstatements.onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discount;
    }

    @Override
    public void applyDiscount(double discountRate) {
        this.discount = (getPrice() * getQuantity()) * (discountRate / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: $" + discount;
    }
}