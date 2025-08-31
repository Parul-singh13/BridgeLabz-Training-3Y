import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double[] numbers= new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter numbers (maximum 10 numbers, enter 0 or negative to stop):");
        
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double num = scanner.nextDouble();
            
            
            if (num <= 0) {
                break;
            }
            
            
            if (index >= 10) {
                break;
            }
            
            
            numbers[index] = num;
            index++;
        }
        
    
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i]; // add to total
        }
        
        
        System.out.println("\nTotal sum of all numbers: " + total);
        
        scanner.close();
    }
}
