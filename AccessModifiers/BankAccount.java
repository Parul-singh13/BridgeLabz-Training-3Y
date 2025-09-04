class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to demonstrate access modifiers
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: " + getBalance()); // private
    }

    // Main method to generate output
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123", "Rita", 1000.0);
        sa.displayDetails();
        System.out.println();
        sa.deposit(500.0);
        System.out.println("After deposit: " + sa.getBalance());
        sa.withdraw(200.0);
        System.out.println("After withdraw: " + sa.getBalance());
    }
}
