class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to generate output
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Jay", "Car");
        v1.displayVehicleDetails();
        System.out.println();
        Vehicle.updateRegistrationFee(600.0);
        Vehicle v2 = new Vehicle("Raj", "Bike");
        v2.displayVehicleDetails();
    }
}
