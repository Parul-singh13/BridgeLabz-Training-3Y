class BankAccount {
    // static variable shared across all accounts
    private static String bankName = "Swiss Bank";
    private static int totalAccounts = 0;

    // instance variables
    private final long accountNumber;
    private String accountHolderName;
    private double balance;

    // constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        totalAccounts++;
    }

    // static method to display total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }

    // method to display account details with instanceof check
    public static void displayDetails(Object obj) {
        if(obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            System.out.println("Account Holder: " + account.accountHolderName);
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Balance: " + account.balance);
            System.out.println("Bank: " + bankName);
        } else {
            System.out.println("The object is not an instance of BankAccount.");
        }
    }

    // Getter for balance (optional, for completeness)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
