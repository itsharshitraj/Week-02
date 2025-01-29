package multilevelinheritance.onlineretailordermanagement;

class Order{
    private String orderId;
    private String orderDate;

    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;

    }
    // method getOrder status
    public  void getOrderStatus(){
        System.out.println("Order Status");
        System.out.println("Order Id: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}