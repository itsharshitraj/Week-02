package problemstatements.ecommerceplatform;

class Electronics extends Product implements Taxable {
    private double warrantyYears;


    public Electronics(String productId, String name, double price, double warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: 18% on Electronics";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}