// Online Retail Order Management - Multilevel Inheritance Example
// Best practices: private fields, @Override, clear documentation

class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() { return orderId; }
    public String getOrderDate() { return orderDate; }

    public String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped, Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OrderManagementDemo {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2025-09-17");
        ShippedOrder shipped = new ShippedOrder("ORD123", "2025-09-17", "TRK456");
        DeliveredOrder delivered = new DeliveredOrder("ORD123", "2025-09-17", "TRK456", "2025-09-20");
        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
