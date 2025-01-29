package multilevelinheritance.onlineretailordermanagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder1 = new DeliveredOrder("s5697",
                "24/5/2024",
                "587964dh",
                "29/5/2024" );

        deliveredOrder1.getOrderStatus();
    }
}
