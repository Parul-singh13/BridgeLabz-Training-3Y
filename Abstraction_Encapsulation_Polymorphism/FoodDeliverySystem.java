import java.util.*;

// Interface for Discountable
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem implements Discountable {
    protected String itemName;
    protected double price;
    protected int quantity;

    // Encapsulation: discount field is private
    private double discount = 0.0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Restrict direct access, only controlled discount methods
    protected void setDiscount(double discount) {
        this.discount = discount;
    }

    protected double getDiscount() {
        return discount;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Discountable interface
    @Override
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 50) { // max 50% discount allowed
            setDiscount(percentage);
            System.out.println("Discount of " + percentage + "% applied on " + itemName);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + getDiscount() + "%";
    }
}

// VegItem subclass
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = price * quantity;
        total -= total * (getDiscount() / 100);
        return total; // No extra charges
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem {
    private double nonVegCharge = 20; // extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (price * quantity) + (nonVegCharge * quantity);
        total -= total * (getDiscount() / 100);
        return total;
    }
}

// Main class
public class FoodDeliverySystem {
    public static void processOrder(List<FoodItem> orderList) {
        double grandTotal = 0;

        for (FoodItem item : orderList) {
            item.getItemDetails();
            System.out.println(item.getDiscountDetails());
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price after discount: " + totalPrice);
            grandTotal += totalPrice;
        }

        System.out.println("Grand Total for Order: " + grandTotal);
    }

    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();
        
        VegItem veg1 = new VegItem("Paneer Butter Masala", 150, 2);
        veg1.applyDiscount(10);

        NonVegItem nonVeg1 = new NonVegItem(" butter chicken ", 200, 3);
        nonVeg1.applyDiscount(15);

        orderList.add(veg1);
        orderList.add(nonVeg1);

        // Demonstrating polymorphism: process both types in one method
        processOrder(orderList);
    }
}
