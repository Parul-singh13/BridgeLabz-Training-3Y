import java.time.LocalDate;

public class OnlineRetailOrderManagement {

    // Base class Order
    public static class Order {
        protected String orderId;
        protected LocalDate orderDate;

        public Order(String orderId, LocalDate orderDate) {
            this.orderId = orderId;
            this.orderDate = orderDate;
        }

        public String getOrderStatus() {
            return "Order placed";
        }

        @Override
        public String toString() {
            return "Order ID: " + orderId + ", Order Date: " + orderDate;
        }
    }

    // Subclass ShippedOrder
    public static class ShippedOrder extends Order {
        protected String trackingNumber;

        public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
            super(orderId, orderDate);
            this.trackingNumber = trackingNumber;
        }

        @Override
        public String getOrderStatus() {
            return "Order shipped with tracking number: " + trackingNumber;
        }

        @Override
        public String toString() {
            return super.toString() + ", Tracking Number: " + trackingNumber;
        }
    }

    // Subclass DeliveredOrder extending ShippedOrder
    public static class DeliveredOrder extends ShippedOrder {
        private LocalDate deliveryDate;

        public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
            super(orderId, orderDate, trackingNumber);
            this.deliveryDate = deliveryDate;
        }

        @Override
        public String getOrderStatus() {
            return "Order delivered on: " + deliveryDate;
        }

        @Override
        public String toString() {
            return super.toString() + ", Delivery Date: " + deliveryDate;
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Order order = new Order("ORD123", LocalDate.of(2024, 6, 1));
        System.out.println(order);
        System.out.println("Status: " + order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder("ORD124", LocalDate.of(2024, 6, 2), "TRACK12345");
        System.out.println(shippedOrder);
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", LocalDate.of(2024, 6, 3), "TRACK67890", LocalDate.of(2024, 6, 5));
        System.out.println(deliveredOrder);
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
