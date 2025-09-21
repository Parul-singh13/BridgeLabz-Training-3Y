import java.util.ArrayList;
import java.util.List;

public class SchoolAndStudentsCourses {

    public static class School {
        private String name;
        private List<Student> students;

        public School(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void removeStudent(Student student) {
            students.remove(student);
        }

        public void showStudents() {
            System.out.println("Students in " + name + ":");
            for (Student s : students) {
                System.out.println("- " + s.getName());
            }
        }
    }

    public static class Student {
        private String name;
        private List<Course> courses;

        public Student(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void enrollCourse(Course course) {
            if (!courses.contains(course)) {
                courses.add(course);
                course.addStudent(this);
            }
        }

        public void showCourses() {
            System.out.println(name + " is enrolled in:");
            for (Course c : courses) {
                System.out.println("- " + c.getCourseName());
            }
        }
    }

    public static class Course {
        private String courseName;
        private List<Student> enrolledStudents;

        public Course(String courseName) {
            this.courseName = courseName;
            this.enrolledStudents = new ArrayList<>();
        }

        public String getCourseName() {
            return courseName;
        }

        public void addStudent(Student student) {
            if (!enrolledStudents.contains(student)) {
                enrolledStudents.add(student);
            }
        }

        public void showEnrolledStudents() {
            System.out.println("Students enrolled in " + courseName + ":");
            for (Student s : enrolledStudents) {
                System.out.println("- " + s.getName());
            }
        }
    }
}
