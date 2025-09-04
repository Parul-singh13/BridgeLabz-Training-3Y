class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name); // protected, accessible in subclass
        System.out.println("CGPA: " + getCGPA()); // private, accessed via public method
    }

    public static void main(String[] args) {
        PostgraduateStudent pgs = new PostgraduateStudent(123, "Rita", 8.5);
        pgs.displayDetails();
        System.out.println();
        pgs.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pgs.getCGPA());
    }
}
