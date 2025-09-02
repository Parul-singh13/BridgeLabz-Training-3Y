class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name,int id, double salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayEmployee(){
        System.out.println("Employee Nmae: "+name);
        System.out.println("Employee id :" +id);
        System.out.println("Employee Salary:" +salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Raj", 4 ,500000);
        Employee emp2= new Employee("Sanjay",8,800000);
        emp.displayEmployee();
        emp2.displayEmployee();
    }

    
}