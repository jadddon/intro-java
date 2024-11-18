package L10;

// Represents a bank account with methods to manage the balance.
public class BankAccount2 {
    // Instance variable to store the balance of the account
    private double balance;

    // Constructor to initialize the bank account with a balance.
    // @param b The initial balance of the account.
    public BankAccount2(double b) {
        balance = b; // Initialize balance with the given value
    }

    // Method to withdraw money from the bank account.
    // @param amount The amount to be withdrawn from the account.
    public void withdraw(double amount) {
        balance -= amount; // Subtract the amount from the balance
    }

    // Method to deposit money into the bank account.
    // @param amount The amount to be deposited into the account.
    public void deposit(double amount) {
        balance += amount; // Add the amount to the balance
    }

    // Method to return the current balance of the bank account.
    // @return The current balance of the account.
    public double getBalance() {
        return balance; // Return the current balance
    }
} 
