package L11;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccount4 class with instance variables, constructors, and methods that encapsulate the behavior of a bank account.
 * 2. Constructors: The program highlights the use of constructors to initialize objects with different parameters, including a default constructor.
 * 3. Method Overloading: It showcases method overloading by providing two versions of the withdraw method, allowing for flexibility in how the method is called.
 * 4. Encapsulation: The program exemplifies encapsulation by hiding the balance instance variable and providing methods to manipulate and access it.
 * 
 * This program includes a BankAccount4 class that simulates a bank account with methods to deposit, withdraw, and get the balance.
 */

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