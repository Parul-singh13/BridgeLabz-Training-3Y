class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = " RLB Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course c1= new Course("Btech",2,200000.0);
        c1.displayCourseDetails();
        c1.updateInstituteName("newName");

    }
}
