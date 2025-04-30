// Base class representing a generic bank account
class Account {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    // Constructor
    public Account(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // Getters and Setters (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to transfer funds from one account to another
    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        if (amount > 0 && fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + fromAccount.getAccountNumber() +
                               " to " + toAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed due to insufficient funds or invalid amount.");
        }
    }
}

// Derived class representing a Savings Account
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, String accountHolder, double interestRate) {
        super(accountNumber, balance, accountHolder);
        this.interestRate = interestRate;
    }

    // Getters and Setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to apply interest on balance
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Applied " + interest + " interest on account " + getAccountNumber());
    }
}

// Derived class representing a Cheque Account with an overdraft limit
class ChequeAccount extends Account {
    private double overdraftLimit;

    // Constructor for ChequeAccount
    public ChequeAccount(String accountNumber, double balance, String accountHolder, double overdraftLimit) {
        super(accountNumber, balance, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    // Getters and Setters
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            super.withdraw(amount);
            System.out.println("Withdrew " + amount + " from account " + getAccountNumber() +
                               " (Overdraft available: " + overdraftLimit + ")");
        } else {
            System.out.println("Insufficient funds or overdraft limit reached for withdrawal.");
        }
    }
}

// Main class to test the banking application
public class BankingApplication {
    public static void main(String[] args) {
        // Create different types of accounts
        Account savingsAccount = new SavingsAccount("12345", 1000.0, "John Doe", 3.5);
        Account chequeAccount = new ChequeAccount("67890", 500.0, "Jane Doe", 200.0);

        // Display initial balances
        System.out.println("Savings Account balance: " + savingsAccount.getBalance());
        System.out.println("Cheque Account balance: " + chequeAccount.getBalance());

        // Transfer funds from savings to cheque account
        Account.transfer(savingsAccount, chequeAccount, 300.0);

        // Display updated balances
        System.out.println("Savings Account balance after transfer: " + savingsAccount.getBalance());
        System.out.println("Cheque Account balance after transfer: " + chequeAccount.getBalance());

        // Test overdraft functionality
        ((ChequeAccount) chequeAccount).withdraw(600.0); // Should allow withdrawal with overdraft
        System.out.println("Cheque Account balance after overdraft withdrawal: " + chequeAccount.getBalance());

        // Test withdrawal exceeding overdraft limit
        ((ChequeAccount) chequeAccount).withdraw(700.0); // Should fail as it's above the limit
        System.out.println("Cheque Account balance after failed withdrawal: " + chequeAccount.getBalance());

        // Apply interest on savings account
        ((SavingsAccount) savingsAccount).applyInterest();
        System.out.println("Savings Account balance after applying interest: " + savingsAccount.getBalance());
    }
}
