package L10;

public class BankAccount3 {
    //Instance variable
    private double balance; 

    // Constructor(s)
    public BankAccount3(double balance) { 
        this.balance = balance; 
    }
    public BankAccount3() { 
        balance = 0; 
    }

    //Methods (instance methods)
    // Method to withdraw money from the bank account.
    // @param amount The amount to be withdrawn
    public void withdraw(double amount) { 
        balance = balance - amount; 
    }
    // Method to withdraw money from the bank account with a fee.
    // @param amount The amount to be withdrawn
    // @param fee The fee to be deducted
    public void withdraw(double amount,double fee) { 
        balance = balance - amount - fee; 
    }
    // Method to deposit money in to the bank account.
    // @param amount The amount to be deposited
    public void deposit(double amount) { 
        balance += amount; 
    }
    // Method to return the current balance.
    // @return The current balance.
    public double getBalance() { 
        return balance; 
    }
}