import java.util.Scanner;

//Prints greatest factor of a number besides itself using for loop.
 
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("Greatest proper factor = 1");
            
        }
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { 
                greatestFactor = i; 
                break; }
        }
        System.out.println("Greatest proper factor = " + greatestFactor);
    
    }
}
