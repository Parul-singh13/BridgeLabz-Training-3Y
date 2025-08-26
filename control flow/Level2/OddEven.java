import java.util.Scanner;

// Prints odd/even between 1..N/
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Enter a natural number more than 1");
            
            
        }
        for (int i = 1; i <= n; i++) {
            if(i % 2== 0){
            System.out.println(i + "is" + "even");
        }else{
            System.out.println(i + "is" + "dd");

        }
        
    }
}
}
