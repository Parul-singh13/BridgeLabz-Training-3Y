import java.util.*;
interface Loanable{
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
    }
abstract class BankAccount implements Loanable{
    private String accountNo;
    private String hName;
    protected double balance;
    public BankAccount(String accountNo,String hName,double balance){
        this.accountNo=accountNo;
        this.hName=hName;
        this.balance=balance;
    }

    public String getAccountNo(){
        return accountNo;
    }
     public String getHolderName() {
        return hName;
    }

    public double getBalance() {
        return balance;
    }
    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
       // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }
    //abstract
    public abstract double calculateInterest(); 

}
//Saving Account
class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; // 4% annual

    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application submitted for Savings Account: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 5000; // eligible if balance ≥ 5000
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    private double interestRate = 0.02; // 2% annual

    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application submitted for Current Account: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 10000; // eligible if balance ≥ 10000
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV123", "Alice", 6000));
        accounts.add(new CurrentAccount("CUR456", "Bob", 12000));

        // Demonstrating polymorphism
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNo());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Calculated Interest: " + account.calculateInterest());

            // Loan eligibility
            if (account.calculateLoanEligibility()) {
                account.applyForLoan(5000);
                System.out.println("Loan approved");
            } else {
                System.out.println("Loan denied");
            }

            
        }
    }
}

