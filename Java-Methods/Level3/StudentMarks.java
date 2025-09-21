import java.util.Random;

public class StudentMarks {

    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3]; // Physics, Chemistry, Math
        Random rand = new Random();
        for (int i = 0; i < students; i++) {
            marks[i][0] = rand.nextInt(101); // Physics: 0-100
            marks[i][1] = rand.nextInt(101); // Chemistry: 0-100
            marks[i][2] = rand.nextInt(101); // Math: 0-100
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        int students = marks.length;
        double[][] results = new double[students][3]; // total, average, percentage
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 3; // percentage out of 100
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // round to 2 decimal places
        }
        return results;
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\n",
                i + 1, marks[i][0], marks[i][1], marks[i][2],
                (int)results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int students = 5; // example with 5 students
        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
    }
}
