package L10;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccountTester3 class, showcasing the use of objects and their methods.
 * 2. Method Overloading: The program highlights the use of method overloading to provide different ways to withdraw money from the bank account, either with or without a fee.
 * 3. Encapsulation: The program demonstrates encapsulation by hiding the balance of the bank account within the class and providing methods to manipulate and access it.
 * 
 * This program includes a BankAccountTester3 class that tests the functionality of the BankAccount3 class by creating instances, depositing and withdrawing money, and printing the balance at different stages.
 */
public class BankAccountTester3 {
    // Main method to run the application
    public static void main(String[] args) {
        // Create a new BankAccount3 object with default constructor
        BankAccount3 a = new BankAccount3();
        // Create a new BankAccount3 object with a balance of $100
        BankAccount3 b = new BankAccount3(100);
        
        // Print the initial balance of account 'a'
        System.out.println("Initial balance of account 'a': " + a.getBalance());
        // Print the initial balance of account 'b'
        System.out.println("Initial balance of account 'b': " + b.getBalance());
        
        // Withdraw $50 from account 'b'
        b.withdraw(50);
        // Print the balance of account 'b' after the first withdrawal
        System.out.println("Balance of account 'b' after first withdrawal: " + b.getBalance());
        
        // Withdraw $30 with a fee of $5 from account 'b'
        b.withdraw(30, 5);
        // Print the balance of account 'b' after the second withdrawal
        System.out.println("Balance of account 'b' after second withdrawal: " + b.getBalance());
        
        // Print the state of account 'a' to show it remains unchanged
        System.out.println("State of account 'a' remains unchanged: " + a);
    }
    }
