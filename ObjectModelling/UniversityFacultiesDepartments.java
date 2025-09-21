import java.util.ArrayList;
import java.util.List;

public class UniversityFacultiesDepartments {

    public static class University {
        private String name;
        private List<Department> departments;

        public University(String name) {
            this.name = name;
            this.departments = new ArrayList<>();
        }

        public void addDepartment(Department dept) {
            departments.add(dept);
        }

        public void removeDepartment(Department dept) {
            departments.remove(dept);
        }

        public void deleteUniversity() {
            System.out.println("Deleting university " + name + " and all its departments.");
            departments.clear();
        }

        public void showDepartments() {
            System.out.println("Departments in " + name + ":");
            for (Department d : departments) {
                System.out.println("- " + d.getName());
            }
        }
    }

    public static class Department {
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Faculty {
        private String name;

        public Faculty(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
