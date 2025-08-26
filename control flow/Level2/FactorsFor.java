import java.util.Scanner;

// all factors of a positive integer using for loop.
 
public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive integer");
            
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
            System.out.println(i);
            }
        }
        
    }
}
