import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, bmi

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        System.out.println("Weight(kg)  Height(cm)  BMI       Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-11.2f %-11.2f %-9.2f %s%n", data[i][0], data[i][1], data[i][2], getBMIStatus(data[i][2]));
        }
        scanner.close();
    }
}
