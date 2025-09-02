public class MobilePhoneDetails {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        MobilePhoneDetails phone = new MobilePhoneDetails("Samsung", "Galaxy S21", 799.99);
        phone.displayDetails();
    }
}
