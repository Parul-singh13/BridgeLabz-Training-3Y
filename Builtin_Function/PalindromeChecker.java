import java.util.Scanner;

public class PalindromeChecker {

    public static String getInput(Scanner scanner) {
        System.out.print("Enter a string to check if it is a palindrome: ");
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = getInput(scanner);
        boolean result = isPalindrome(input);
        displayResult(input, result);
        scanner.close();
    }
}
