
import java.util.Scanner;

public class Uppercase{

    public static String customToUpper(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch= = text.charAt(i);
            if(ch>='a' && ch<='z'){
                result += (char)(ch - 32);
            }else{
                result += ch;
            }

        }
        return result;

    }
    public static boolean compareStrings(String s1, String s2){
        if(s1.length() != s2.length()) return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String custom = customToUpper(text);
        String builtIn = text.toUpperCase();
        System.out.println("Custom Uppercase: " + custom);
        System.out.println("Built-in Uppercase: " + builtIn);
        System.out.println("Are they equal? " + compareStrings(custom, builtIn));
        
            }

}