package L10;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccount2 class, showcasing the use of objects and their methods.
 * 2. Method Invocation: The program highlights the use of methods from the BankAccount2 class to manipulate and access the state of bank account objects.
 * 
 * This program includes a BankAccount2 class that has methods to withdraw, deposit, and get the balance of a bank account.
 */
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
