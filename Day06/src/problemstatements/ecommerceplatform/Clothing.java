package problemstatements.ecommerceplatform;

class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate is 12 % on Clothing ";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size : " + size);
    }
}
