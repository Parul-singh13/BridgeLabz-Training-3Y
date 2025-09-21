public class EmployeeManagementSystem {

    static String companyName = "Tech Solutions";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    public EmployeeManagementSystem(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Company: " + companyName);
    }

    public static void main(String[] args) {
        EmployeeManagementSystem emp1 = new EmployeeManagementSystem(101, "Alice", "Developer");
        EmployeeManagementSystem emp2 = new EmployeeManagementSystem(102, "Bob", "Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        displayTotalEmployees();

        Object obj = emp1;
        if (obj instanceof EmployeeManagementSystem) {
            System.out.println("Object is an instance of EmployeeManagementSystem");
        }
    }
}
