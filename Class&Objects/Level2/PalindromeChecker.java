public class PalindromeChecker{
    String text;

    public PalindromeChecker(String text) {
        this.text=text;
    }
    public boolean isPalindrome(){
        String cleantext= text.replaceAll("\\s","").toLowerCase();
        String reverseText= new StringBuilder(cleantext).reverse().toString();
        return cleantext.equals(reverseText);

    }
    public void displayResult(){
        if(isPalindrome()){
            System.out.println(text +"is palindrome");
        }
        else{
            System.out.println(text+ "is not palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeChecker checker1= new PalindromeChecker(" Never a foot too far even");
        PalindromeChecker checker= new PalindromeChecker("Hello");
        checker1.displayResult();
        checker.displayResult();

    }
    }
    
