public class VehicleRegistrationSystem {

    static double registrationFee = 100.0;
    static int totalVehicles = 0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public VehicleRegistrationSystem(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        totalVehicles++;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        System.out.println("Registration Number: " + registrationNumber + ", Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: $" + registrationFee);
    }

    public static void main(String[] args) {
        VehicleRegistrationSystem vehicle1 = new VehicleRegistrationSystem("REG123", "Alice", "Car");
        VehicleRegistrationSystem vehicle2 = new VehicleRegistrationSystem("REG456", "Bob", "Motorcycle");

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        updateRegistrationFee(120.0);
        System.out.println("Updated registration fee to $120.0");

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        Object obj = vehicle1;
        if (obj instanceof VehicleRegistrationSystem) {
            System.out.println("Object is an instance of VehicleRegistrationSystem");
        }
    }
}
