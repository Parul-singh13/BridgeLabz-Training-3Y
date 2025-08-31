import java.util.Scanner;

public class StudentGrades2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // 2D array to store Physics, Chemistry, Maths marks
        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");

                    marks[i][j] = sc.nextDouble();
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grade
            if (percentage[i] >= 90) grade[i] = "A+";
            else if (percentage[i] >= 75) grade[i] = "A";
            else if (percentage[i] >= 60) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + marks[i][0] +
                    " | Chemistry: " + marks[i][1] +
                    " | Maths: " + marks[i][2] +
                    " | %: " + String.format("%.2f", percentage[i]) +
                    " | Grade: " + grade[i]);
        }

        sc.close();
    }
}