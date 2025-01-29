package multilevelinheritance.onlineretailordermanagement;

class DeliveredOrder extends ShippedOrder{
    protected String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    // method to get delivery date
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date : " + deliveryDate);
    }
}