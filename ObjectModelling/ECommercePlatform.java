import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {

    public static class Customer {
        private String name;
        private List<Order> orders;

        public Customer(String name) {
            this.name = name;
            this.orders = new ArrayList<>();
        }

        public void placeOrder(Order order) {
            orders.add(order);
        }

        public String getName() {
            return name;
        }
    }

    public static class Order {
        private String orderId;
        private List<Product> products;

        public Order(String orderId) {
            this.orderId = orderId;
            this.products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public String getOrderId() {
            return orderId;
        }

        public void showProducts() {
            System.out.println("Products in order " + orderId + ":");
            for (Product p : products) {
                System.out.println("- " + p.getProductName());
            }
        }
    }

    public static class Product {
        private String productName;

        public Product(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return productName;
        }
    }
}
