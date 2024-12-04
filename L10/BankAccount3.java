package L10;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccount3 class, showcasing the use of objects and their methods.
 * 2. Method Overloading: The program highlights the use of method overloading to provide different ways to withdraw money from the bank account, either with or without a fee.
 * 3. Encapsulation: The program demonstrates encapsulation by hiding the balance of the bank account within the class and providing methods to manipulate and access it.
 * 
 * This program includes a BankAccount3 class that has methods to withdraw, deposit, and get the balance of a bank account, with an additional feature to withdraw with a fee.
 */
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