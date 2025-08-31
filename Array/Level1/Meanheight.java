import java.util.Scanner;

public class Meanheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        System.out.println("Enter the heights of football players");
        
    
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + " (in meters) ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / 11;
        
    
        System.out.println("\nThe mean height of the football team is " + mean + " meters");
        
        
    }
}
