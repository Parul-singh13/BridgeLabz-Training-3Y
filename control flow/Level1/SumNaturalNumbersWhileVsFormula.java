
/**
 * Computes sum of n natural numbers using while and compares with formula n(n+1)/2.
 */
import java.util.Scanner;
public class SumNaturalNumbersWhileVsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.println("Not Natural number");
        }
        else{
           int fSum= n*(n+1)/2;
           int loopSum=0;
           int i=1;
           while(i<=n){
            loopSum+=i;
            i++;
           }


        }
           if (fSum == loopSum) {
                System.out.println("Both computations are correct and match");
            } else {
                System.out.println(" The results do not match");
            }

    }

}