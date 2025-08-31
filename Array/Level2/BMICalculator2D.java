
import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // 2D array to store height, weight, BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        
        for (int i = 0; i < number; i++) {
            double weight, height;

            
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
            } while (height <= 0);

            // Store weight & height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }


        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + personData[i][0] + " kg" +
                    " | Height: " + personData[i][1] + " m" +
                    " | BMI: " + String.format("%.2f", personData[i][2]) +
                    " | Status: " + weightStatus[i]);
        }

        sc.close();
    }
}