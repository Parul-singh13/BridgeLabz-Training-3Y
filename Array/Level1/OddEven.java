import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input. Not a natural number.");
            return;
        }

        int[] e = new int[num/2 + 1];
        int[] o = new int[num/2 + 1];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                e[eIndex++] = i;
            else
                o[oIndex++] = i;
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oIndex; i++) System.out.print(o[i] + " ");
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < eIndex; i++) System.out.print(e[i] + " ");
    }
}