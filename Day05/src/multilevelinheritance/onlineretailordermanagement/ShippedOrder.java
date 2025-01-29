package multilevelinheritance.onlineretailordermanagement;

class ShippedOrder extends Order{
    protected String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    // method to get the tracking number
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}