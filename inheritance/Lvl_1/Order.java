class Order {
  int orderId;
  String orderDate;

  public Order(int orderId, String orderDate) {
    this.orderId = orderId;
    this.orderDate = orderDate;
  }

  public String getOrderStatus() {
    return "Order with : " + orderId + " placed on : " + orderDate;
  }

  public static void main(String[] args) {
    Order order = new Order(123, "22-jan-2009");
    ShippedOrder shippedOrder = new ShippedOrder(124, "2025-03-07", "TRK987654");
    DeliveredOrder deliveredOrder = new DeliveredOrder(125, "2025-03-06", "TRK123456", "2025-03-09");

    System.out.println(order.getOrderStatus());
    System.out.println(shippedOrder.getOrderStatus());
    System.out.println(deliveredOrder.getOrderStatus());
  }
}

class ShippedOrder extends Order {
  String trackingNumber;

  public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
    super(orderId, orderDate);
    this.trackingNumber = trackingNumber;
  }

  @Override
  public String getOrderStatus() {
    return super.getOrderStatus() + " shipped with tracking no. : " + trackingNumber;
  }
}

class DeliveredOrder extends ShippedOrder {
  String deliveryDate;

  public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
    super(orderId, orderDate, trackingNumber);
    this.deliveryDate = deliveryDate;
  }

  @Override
  public String getOrderStatus() {
    return super.getOrderStatus() + " delivered on : " + deliveryDate;
  }
}
