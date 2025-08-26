import java.util.Scanner;

//Finds youngest and tallest among three friends Amar, Akbar, Anthony.
 
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int hAmar = sc.nextInt();
        int hAkbar = sc.nextInt();
        int hAnthony = sc.nextInt();

        // Youngest (smallest age)
        int minAge = ageAmar;
        String youngest = "Amar";
        if (ageAkbar < minAge) { 
            minAge = ageAkbar; 
            youngest = "Akbar"; }
        if (ageAnthony < minAge) {
             minAge = ageAnthony; 
             youngest = "Anthony"; }

        // Tallest (largest height)
        int maxH = hAmar;
        String tallest = "Amar";
        if (hAkbar > maxH) { 
            maxH = hAkbar; 
            tallest = "Akbar"; }
        if (hAnthony > maxH) {
             maxH = hAnthony; 
             tallest = "Anthony"; }

        System.out.println("Youngest: " + youngest + " (" + minAge + ")");
        System.out.println("Tallest: " + tallest + " (" + maxH + ")");
        
    }
}
