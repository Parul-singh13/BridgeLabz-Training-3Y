import java.util.Scanner;

public class FactorialUsingRecursion {

    public static int getInput(Scanner scanner) {
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        return scanner.nextInt();
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = getInput(sc);
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(number);
            displayResult(number, fact);
        }
        sc.close();
    }
}
