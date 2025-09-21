public class UniversityStudentManagement {

    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    public UniversityStudentManagement(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", Grade: " + grade + ", University: " + universityName);
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    public static void main(String[] args) {
        UniversityStudentManagement student1 = new UniversityStudentManagement(201, "John", "A");
        UniversityStudentManagement student2 = new UniversityStudentManagement(202, "Jane", "B");

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        displayTotalStudents();

        Object obj = student1;
        if (obj instanceof UniversityStudentManagement) {
            System.out.println("Object is an instance of UniversityStudentManagement");
        }
    }
}
