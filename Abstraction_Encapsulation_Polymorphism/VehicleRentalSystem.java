import java.util.*;

// interface for Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// abstract class Vehicle
abstract class Vehicle implements Insurable {
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    // encapsulated insurance policy number
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Getter for policy number (restricted, no setter for safety)
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method for rental cost
    public abstract double calculateRentalCost(int days);
}

// Subclass Car
class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days; // Simple daily rate
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Subclass 
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.8;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Subclass 
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days + 500;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.2; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// demonstrate polymorphism
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000, "C-INS-001"));
        vehicles.add(new Bike("BIKE456", 300, "B-INS-002"));
        vehicles.add(new Truck("TRUCK789", 2000, "T-INS-003"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Type: " + v.type);
            System.out.println("Vehicle Number: " + v.vehicleNumber);
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));
            System.out.println("Insurance Cost: " + v.calculateInsurance());
            System.out.println("Insurance Details: " + v.getInsuranceDetails());
        }
    }
}
