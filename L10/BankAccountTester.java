package L10;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccountTester class, showcasing the use of objects and their methods.
 * 2. Method Invocation: The program highlights the use of methods from the BankAccount class to manipulate and access the state of bank account objects.
 * 
 * This program includes a BankAccountTester class that tests the functionality of the BankAccount class by creating an instance, depositing and withdrawing money, and printing the balance at different stages.
 */
// Class to test the BankAccount class
public class BankAccountTester {
    // Main method to run the application
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount a = new BankAccount();
        // Print the initial balance of the account
        System.out.println("Initial balance: " + a.getBalance());
        // Deposit $100 into the account
        a.deposit(100);
        // Print the balance after deposit
        System.out.println("Balance after deposit: " + a.getBalance());
        // Withdraw $50 from the account
        a.withdraw(50);
        // Withdraw $3.75 from the account
        a.withdraw(3.75);
        // Print the final balance of the account
        System.out.println("Final balance: " + a.getBalance());
    }
}
