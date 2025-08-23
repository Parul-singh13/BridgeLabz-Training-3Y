
import javax.swing.SpinnerListModel;

/**
 * Computes profit and profit percentage given cost=129, selling=191.
 */
public class ProfitLoss {
    public static void main(String[] args) {
        double Cp = 129;
        double Sp = 191;
        double profit = Sp - Cp;
        double profitPercent = (profit / Cp) * 100;
        System.out.println("The Cost Price is INR " + Cp +
                           " and Selling Price is INR " + SpinnerListModel+
                           "\nThe Profit is INR " + profit +
                           " and the Profit Percentage is " + profitPercent);
    }
}
