package problemstatements.onlinefooddeliverysystem;


     class NonVegItem extends FoodItem implements Discountable {
         private double discount;
         private static final double NON_VEG_SURCHARGE = 2.5; // Fixed surcharge per item

         public NonVegItem(String itemName, double price, int quantity) {
             super(itemName, price, quantity);
             this.discount = 0.0;
         }

         @Override
         public double calculateTotalPrice() {
             double basePrice = (getPrice() + NON_VEG_SURCHARGE) * getQuantity();
             return basePrice - discount;
         }

         @Override
         public void applyDiscount(double discountRate) {
             double basePrice = (getPrice() + NON_VEG_SURCHARGE) * getQuantity();
             this.discount = basePrice * (discountRate / 100);
         }

         @Override
         public String getDiscountDetails() {
             return "Discount applied: $" + discount;
         }
     }

