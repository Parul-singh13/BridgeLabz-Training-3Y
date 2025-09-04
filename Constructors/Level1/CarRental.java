class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Parul";
        this.carModel = "XUV";
        this.rentalDays = 3;
        this.dailyRate = 500.0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public static void main(String[] args) {
        CarRental rental1=new CarRental("Preeti","XUV",6,500.0);
        rental1.calculateTotalCost();
    }
}
