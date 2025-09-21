import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", f, fahrenheitToCelsius(f));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scanner.nextDouble();
            System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", c, celsiusToFahrenheit(c));
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
