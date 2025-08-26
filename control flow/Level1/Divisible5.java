import java.util.Scanner;

//Checks if a number is divisible by 5.
 
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // read user input
        int num = input.nextInt();
        // check divisibility
        boolean divisible = (num % 5 == 0);
        // display result
        System.out.println("Is the number " + num + " divisible by 5? " + divisible);
        input.close();
    }
}
