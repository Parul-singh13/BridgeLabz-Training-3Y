import java.util.ArrayList;
import java.util.List;

// Interface for taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class Product
abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();
}

// Concrete class Electronics
class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "GST 18%";
    }
}

// Concrete class Clothing
class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "GST 12%";
    }
}

// Concrete class Groceries
class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.02; // 2% discount
    }
}

// Main class to demonstrate polymorphism
public class ECommerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001", "Laptop", 50000));
        products.add(new Clothing("C001", "T-Shirt", 1000));
        products.add(new Groceries("G001", "Rice", 500));

        printFinalPrices(products);
    }

    // Polymorphic method to calculate and print final prices
    public static void printFinalPrices(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            String taxDetails = "No tax";
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                taxDetails = ((Taxable) product).getTaxDetails();
            }
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product: " + product.getName() +
                               ", Original Price: " + product.getPrice() +
                               ", Discount: " + discount +
                               ", Tax: " + tax + " (" + taxDetails + ")" +
                               ", Final Price: " + finalPrice);
        }
    }
}
