import java.util.ArrayList;
import java.util.List;

public class UniversityManagementSystem {

    public static class Student {
        private String name;
        private List<Course> enrolledCourses;

        public Student(String name) {
            this.name = name;
            this.enrolledCourses = new ArrayList<>();
        }

        public void enrollCourse(Course course) {
            if (!enrolledCourses.contains(course)) {
                enrolledCourses.add(course);
            }
        }

        public String getName() {
            return name;
        }
    }

    public static class Professor {
        private String name;
        private List<Course> teachingCourses;

        public Professor(String name) {
            this.name = name;
            this.teachingCourses = new ArrayList<>();
        }

        public void assignCourse(Course course) {
            if (!teachingCourses.contains(course)) {
                teachingCourses.add(course);
            }
        }

        public String getName() {
            return name;
        }
    }

    public static class Course {
        private String courseName;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }
    }
}
