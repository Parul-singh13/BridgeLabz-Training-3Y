public class VehicleManagementSystem {

    // Superclass Vehicle
    public static class Vehicle {
        protected int maxSpeed;
        protected String model;

        public Vehicle(int maxSpeed, String model) {
            this.maxSpeed = maxSpeed;
            this.model = model;
        }
    }

    // Interface Refuelable
    public interface Refuelable {
        void refuel();
    }

    // Subclass ElectricVehicle
    public static class ElectricVehicle extends Vehicle {
        public ElectricVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }

        public void charge() {
            System.out.println(model + " is charging.");
        }
    }

    // Subclass PetrolVehicle implements Refuelable
    public static class PetrolVehicle extends Vehicle implements Refuelable {
        public PetrolVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }

        @Override
        public void refuel() {
            System.out.println(model + " is refueling.");
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang");

        ev.charge();
        pv.refuel();
    }
}
