import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static boolean isNaturalNumber(int n) {
        return n > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (!isNaturalNumber(n)) {
            System.out.println("The number is not a natural number.");
            sc.close();
            return;
        }

        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);

        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        System.out.println("Both methods give the same result: " + (sumRec == sumForm));
        sc.close();
    }
}
