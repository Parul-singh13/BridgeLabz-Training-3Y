import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;

    public Account(String accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public Bank getBank() {
        return bank;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() + " in " + acc.getBank().getName() + ": $" + acc.getBalance());
        }
    }
}

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Account openAccount(Customer customer, String accountNumber) {
        Account account = new Account(accountNumber, this);
        customer.addAccount(account);
        return account;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        bank.addCustomer(cust1);
        bank.addCustomer(cust2);

        Account acc1 = bank.openAccount(cust1, "ACC001");
        Account acc2 = bank.openAccount(cust1, "ACC002");
        Account acc3 = bank.openAccount(cust2, "ACC003");

        acc1.deposit(1000);
        acc2.deposit(500);
        acc3.deposit(200);

        cust1.viewBalance();
        System.out.println();
        cust2.viewBalance();
    }
}
