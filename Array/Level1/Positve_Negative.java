import java.util.*;

public class Positve_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Checking each number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("Number " + arr[i] + " is Positive and Even");
                } else {
                    System.out.println("Number " + arr[i] + " is Positive and Odd");
                }
            } else if (arr[i] < 0) {
                System.out.println("Number " + arr[i] + " is Negative");
            } else {
                System.out.println("Number " + arr[i] + " is Zero");
            }
        }

        // Comparing first and last elements
        int first = arr[0];
        int last = arr[arr.length - 1];

        if (first == last) {
            System.out.println("The first element (" + first + ") and last element (" + last + ") are Equal.");
        } else if (first > last) {
            System.out.println("The first element (" + first + ") is Greater than the last element (" + last + ").");
        } else {
            System.out.println("The first element (" + first + ") is Less than the last element (" + last + ").");
        }

        sc.close();
    }
}
