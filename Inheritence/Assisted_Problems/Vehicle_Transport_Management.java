// Superclass Vehicle
class Vehicle {
    private int maxSpeed;
    private String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Vehicle: Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }

    // Getters (optional, for completeness)
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }
}

// Subclass Car
class Car extends Vehicle {
    private int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override displayInfo to include seatCapacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car: Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity; // in tons

    // Constructor
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Override displayInfo to include loadCapacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Truck: Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private int engineCapacity; // in cc

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, int engineCapacity) {
        super(maxSpeed, fuelType);
        this.engineCapacity = engineCapacity;
    }

    // Override displayInfo to include engineCapacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle: Engine Capacity: " + engineCapacity + " cc");
    }
}

// Main class to demonstrate polymorphism
public class Vehicle_Transport_Management {
    public static void main(String[] args) {
        // Create an array of Vehicle type to store different subclasses
        Vehicle[] vehicles = new Vehicle[3];

        // Instantiate subclasses
        vehicles[0] = new Car(200, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(180, "Petrol", 250);

        // Demonstrate polymorphism: call displayInfo() on each object
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println(); // For better readability
        }
    }
}
