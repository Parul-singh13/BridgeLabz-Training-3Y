public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee instance
        Employee emp = new Employee(101, "HR", 50000.0);
        System.out.println("Employee ID: " + emp.employeeID);
        System.out.println("Employee Department: " + emp.getDepartment()); // Using a getter for protected field
        System.out.println("Employee Salary: " + emp.getSalary()); // Using a getter for private field

        // Modify salary using public method
        emp.setSalary(60000.0);
        System.out.println("Updated Employee Salary: " + emp.getSalary());

        // Create a Manager instance (subclass)
        Manager mgr = new Manager(102, "IT", 70000.0);
        System.out.println("Manager ID: " + mgr.employeeID); // Accessing public field
        System.out.println("Manager Department: " + mgr.getDepartment()); // Accessing protected field via method
        System.out.println("Manager Salary: " + mgr.getSalary());
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Getter for salary (private field)
    public double getSalary() {
        return salary;
    }

    // Getter for department 
    public String getDepartment() {
        return department;
    }
}

class Manager extends Employee {
    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to access employeeID and department
    public void displayInfo() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Manager Department: " + department);
    }
}
