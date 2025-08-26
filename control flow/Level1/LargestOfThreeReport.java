import java.util.Scanner;

//Reports which of the three numbers is the largest (ties count as true for both)/
public class LargestOfThreeReport {


public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        
        int number2 = sc.nextInt();
    
        int number3 = sc.nextInt();

        
        boolean isFirstLargest = false;
        boolean isSecondLargest = false;
        boolean isThirdLargest = false;

        
        if (number1 >= number2 && number1 >= number3) {
            isFirstLargest = true;
        } 
        if (number2 >= number1 && number2 >= number3) {
            isSecondLargest = true;
        } 
        if (number3 >= number1 && number3 >= number2) {
            isThirdLargest = true;
        }


        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        
    }
}
}