package L10;

public class BankAccount {
    // Instance variable to store the balance of the account
    private double balance = 10; // Initializes to 10

    // Method to withdraw money from the bank account
    // @param amount The amount to be withdrawn
    public void withdraw(double amount) {
        balance -= amount; // Subtract the amount from the balance
    }

    // Method to deposit money into the bank account
    // @param amount The amount to be deposited
    public void deposit(double amount) {
        balance += amount; // Add the amount to the balance
    }

    // Method to return the current balance of the bank account
    // @return The current balance of the account
    public double getBalance() {
        return balance; // Return the current balance
    }
}
