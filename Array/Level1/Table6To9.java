import java.util.Scanner;

public class Table6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number for multiplication table from 6 to 9");
        int number = scanner.nextInt();
        
        
        int[] mt = new int[4]; 
        
        
        for (int i = 6; i <= 9; i++) {
            mt[i - 6] = number * i; 
        }
        
        // Display the result
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + mt[i - 6]);
        }
        
        scanner.close();
    }
}
