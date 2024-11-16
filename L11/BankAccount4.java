package L11;

public class BankAccount4 {
    //Instance variable
    private double balance;
    // Constructor(s)
    public BankAccount4(double balance) {
    this.balance = balance;
    }
    public BankAccount4() {
    balance = 0;
    }
    //Methods (instance methods)
    // Method to withdraw money from the bank account.
    // @param amount The amount to be withdrawn
    public void withdraw(double amount) {
    balance = balance - amount;
    }
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
    // overriding the toString method that we inherited from Object
    public String toString(){
    return "Bank Account Balance: " + balance;
    }
    }