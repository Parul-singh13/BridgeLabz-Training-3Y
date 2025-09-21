public class SchoolSystemRoles {

    // Base class Person
    public static class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayRole() {
            System.out.println("General Person");
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }

    // Subclass Teacher
    public static class Teacher extends Person {
        private String subject;

        public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }

        @Override
        public void displayRole() {
            System.out.println("Teacher");
        }

        @Override
        public String toString() {
            return super.toString() + ", Subject: " + subject;
        }
    }

    // Subclass Student
    public static class Student extends Person {
        private String grade;

        public Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }

        @Override
        public void displayRole() {
            System.out.println("Student");
        }

        @Override
        public String toString() {
            return super.toString() + ", Grade: " + grade;
        }
    }

    // Subclass Staff
    public static class Staff extends Person {
        private String department;

        public Staff(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }

        @Override
        public void displayRole() {
            System.out.println("Staff");
        }

        @Override
        public String toString() {
            return super.toString() + ", Department: " + department;
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 40, "Mathematics");
        teacher.displayRole();
        System.out.println(teacher);

        Student student = new Student("Bob", 16, "10th Grade");
        student.displayRole();
        System.out.println(student);

        Staff staff = new Staff("Charlie", 35, "Administration");
        staff.displayRole();
        System.out.println(staff);
    }
}
