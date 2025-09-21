import java.util.Random;

public class BonusCalculator {

    public static int[][] generateSalariesAndYears(int employees) {
        int[][] data = new int[employees][2]; // [][0] = salary, [][1] = years of service
        Random rand = new Random();
        for (int i = 0; i < employees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // 5-digit salary between 10000 and 99999
            data[i][1] = rand.nextInt(11); // years of service between 0 and 10
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        int employees = data.length;
        double[][] result = new double[employees][2]; // [][0] = new salary, [][1] = bonus
        for (int i = 0; i < employees; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int employees = 10;
        int[][] oldData = generateSalariesAndYears(employees);
        double[][] newData = calculateNewSalaryAndBonus(oldData);
        displaySummary(oldData, newData);
    }
}
