public class ShoppingCartSystem {

    static double discount = 10.0; // discount percentage shared by all products
    static int totalProducts = 0;

    final int productID;
    String productName;
    double price;
    int quantity;

    public ShoppingCartSystem(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public double getPriceAfterDiscount() {
        return price - (price * discount / 100);
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity + ", Price after discount: $" + getPriceAfterDiscount());
    }

    public static void main(String[] args) {
        ShoppingCartSystem prod1 = new ShoppingCartSystem(1001, "Laptop", 1200.0, 1);
        ShoppingCartSystem prod2 = new ShoppingCartSystem(1002, "Smartphone", 800.0, 2);

        prod1.displayProductDetails();
        prod2.displayProductDetails();

        updateDiscount(15.0);
        System.out.println("Updated discount to 15%");

        prod1.displayProductDetails();
        prod2.displayProductDetails();

        Object obj = prod1;
        if (obj instanceof ShoppingCartSystem) {
            System.out.println("Object is an instance of ShoppingCartSystem");
        }
    }
}
