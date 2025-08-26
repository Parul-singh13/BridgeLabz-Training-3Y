import java.util.Scanner;

//Prints all multiples of a positive integer less than 100 using while loop.

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive integer less than 100.");
            
        }
        int counter = number;
        while (counter < 100) {
            if (counter % number == 0) System.out.println(counter);
            counter++;
        }
        
    }
}
