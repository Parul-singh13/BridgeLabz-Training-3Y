import java.util.Scanner;

//Prints greatest factor of a number besides itself using while loop.

public class GreatestProperFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("Greatest proper factor = 1");
            
        }
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) { 
                greatestFactor = counter; 
                break; }
            counter--;
        }
        System.out.println("Greatest proper factor = " + greatestFactor);
        
    }
}
