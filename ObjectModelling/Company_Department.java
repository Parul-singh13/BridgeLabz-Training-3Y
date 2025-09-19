import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void display() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println("  Employee: " + e.getName());
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(int index) {
        return departments.get(index);
    }

    public void display() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.display();
        }
    }

    public void closeCompany() {
        departments.clear();
        System.out.println("Company closed, all departments and employees removed.");
    }

    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("HR");
        company.addDepartment("IT");

        company.getDepartment(0).addEmployee("Alice");
        company.getDepartment(0).addEmployee("Charlie");
        company.getDepartment(1).addEmployee("Bob");

        company.display();
        System.out.println();
        company.closeCompany();
        company.display();
    }
}
