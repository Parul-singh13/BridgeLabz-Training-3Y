import java.util.Scanner;

//Bonus 5% if service years > 5 .
 
public class EmployeeBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        if(years > 5){
        double bonus =  0.05 * salary ;
        
        System.out.println("Bonus = " + bonus);
        }
    }
}
