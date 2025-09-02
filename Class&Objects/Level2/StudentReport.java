public class StudentReport {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public StudentReport(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student's details and grade
    public void displayDetails() {
        char grade = calculateGrade();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        StudentReport student = new StudentReport("Raj", 12, 85.5);
        student.displayDetails();
    }
}
