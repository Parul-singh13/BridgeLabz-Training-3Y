class Product {
     String productName;
     double price;
     private  static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1= new Product("Key",30.0);
        p1.displayProductDetails();
        p1.displayTotalProducts();
    }
}
