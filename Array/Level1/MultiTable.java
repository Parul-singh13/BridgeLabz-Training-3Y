import java.util.*;
//Create a program to print a multiplication table of a number.
public class MultiTable{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        // Get the number for multiplication table
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Define array to store multiplication results from 1 to 10
        int[] mt= new int[10];
        
        // Calculate and store multiplication results
        for (int i = 0; i < mt.length; i++) {
            mt[i] = number * (i + 1);
        }
        
        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < mt.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + mt[i]);
        }
        }

    }
