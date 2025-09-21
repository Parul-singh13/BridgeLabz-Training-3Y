public class BankAccountTypes {

    // Base class BankAccount
    public static class BankAccount {
        protected String accountNumber;
        protected double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void displayAccountType() {
            System.out.println("General Bank Account");
        }

        @Override
        public String toString() {
            return "Account Number: " + accountNumber + ", Balance: $" + balance;
        }
    }

    // Subclass SavingsAccount
    public static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        @Override
        public void displayAccountType() {
            System.out.println("Savings Account");
        }

        @Override
        public String toString() {
            return super.toString() + ", Interest Rate: " + interestRate + "%";
        }
    }

    // Subclass CheckingAccount
    public static class CheckingAccount extends BankAccount {
        private double withdrawalLimit;

        public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
            super(accountNumber, balance);
            this.withdrawalLimit = withdrawalLimit;
        }

        @Override
        public void displayAccountType() {
            System.out.println("Checking Account");
        }

        @Override
        public String toString() {
            return super.toString() + ", Withdrawal Limit: $" + withdrawalLimit;
        }
    }

    // Subclass FixedDepositAccount
    public static class FixedDepositAccount extends BankAccount {
        private int depositPeriod; // in months

        public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
            super(accountNumber, balance);
            this.depositPeriod = depositPeriod;
        }

        @Override
        public void displayAccountType() {
            System.out.println("Fixed Deposit Account");
        }

        @Override
        public String toString() {
            return super.toString() + ", Deposit Period: " + depositPeriod + " months";
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000.0, 3.5);
        sa.displayAccountType();
        System.out.println(sa);

        CheckingAccount ca = new CheckingAccount("CA456", 3000.0, 1000.0);
        ca.displayAccountType();
        System.out.println(ca);

        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 10000.0, 12);
        fda.displayAccountType();
        System.out.println(fda);
    }
}
