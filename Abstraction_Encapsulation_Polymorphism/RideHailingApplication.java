import java.util.*;

// Interface for GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    private String currentLocation; // Encapsulation for GPS data

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String startLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = startLocation;
    }

    // Encapsulation: controlled access
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Abstract method for fare calculation
    public abstract double calculateFare(double distance);

    // GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Location updated to: " + currentLocation);
    }
}

// Subclass Car
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm, String startLocation) {
        super(vehicleId, driverName, ratePerKm, startLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 50; // extra base charge
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String startLocation) {
        super(vehicleId, driverName, ratePerKm, startLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // no extra charge
    }
}

// Subclass Auto
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm, String startLocation) {
        super(vehicleId, driverName, ratePerKm, startLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20; // small extra charge
    }
}

// Main class
public class RideHailingApplication {
    // Polymorphic method
    public static void calculateRideFare(List<Vehicle> vehicles, double distance) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Estimated Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR123", "Raj", 15, "Downtown");
        Bike bike = new Bike("BIKE456", "Riya", 8, "City Mall");
        Auto auto = new Auto("AUTO789", "Rohan", 10, "Railway Station");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Demonstrate polymorphism
        calculateRideFare(vehicles, 12.5); // assume 12.5 km ride
    }
}
