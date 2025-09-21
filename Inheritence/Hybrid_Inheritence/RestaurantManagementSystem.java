public class RestaurantManagementSystem {

    // Superclass Person
    public static class Person {
        protected String name;
        protected int id;

        public Person(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    // Interface Worker
    public interface Worker {
        void performDuties();
    }

    // Subclass Chef inherits Person and implements Worker
    public static class Chef extends Person implements Worker {
        public Chef(String name, int id) {
            super(name, id);
        }

        @Override
        public void performDuties() {
            System.out.println(name + " is cooking food.");
        }
    }

    // Subclass Waiter inherits Person and implements Worker
    public static class Waiter extends Person implements Worker {
        public Waiter(String name, int id) {
            super(name, id);
        }

        @Override
        public void performDuties() {
            System.out.println(name + " is serving customers.");
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Emma", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
