

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert to positive if negative
        number = Math.abs(number);

        
        int[] frequency = new int[10];
        while (number > 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }

        
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

        sc.close();
    }
}