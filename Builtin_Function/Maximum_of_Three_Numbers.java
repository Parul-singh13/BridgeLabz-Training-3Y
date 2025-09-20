import java.util.Scanner;

public class Maximum_of_Three_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num= takeInput(sc);
        int max = findMaximum(num);

        System.out.println("The maximum of the three numbers is: " + max);

        sc.close();
    }

    
    public static int[] takeInput(Scanner scanner) {
        int[] nums = new int[3];
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    
    public static int findMaximum(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
