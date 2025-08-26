import java.util.Scanner;

//Counts digits in an integer (absolute value).
 
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        number = Math.abs(number);
        if (number == 0) {
            System.out.println(1);
            
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);
        
    }
}
