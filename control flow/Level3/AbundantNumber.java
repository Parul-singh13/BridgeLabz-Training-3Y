import java.util.Scanner;

//Checks whether a number is an Abundant number.
 
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Not an Abundant Number");
            
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if(sum > number){ 
         System.out.println("Abundant Number");
        }
          else{
            System.out.println("Not an Abundant Number");
    }
    }
}
