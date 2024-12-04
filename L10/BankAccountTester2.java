package L10;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccountTester2 class, showcasing the use of objects and their methods.
 * 2. Method Invocation: The program highlights the use of methods from the BankAccount2 class to manipulate and access the state of bank account objects.
 * 
 * This program includes a BankAccountTester2 class that tests the functionality of the BankAccount2 class by creating instances, depositing and withdrawing money, and printing the balance at different stages.
 */
public class BankAccountTester2 {
    public static void main(String[] args) {
        // Create a BankAccount2 object with an initial balance of $1000
        BankAccount2 a = new BankAccount2(1000);
        // Create a BankAccount2 object with an initial balance of $57
        BankAccount2 b = new BankAccount2(57);
        // The default constructor cannot be used anymore because BankAccount2 has a user-defined constructor
        //BankAccount2 c = new BankAccount2();
        
        // Print the initial balance of account 'a'
        System.out.println("Initial balance of account 'a': " + a.getBalance());
        // Print the initial balance of account 'b'
        System.out.println("Initial balance of account 'b': " + b.getBalance());
        
        // Deposit $100 into account 'a'
        a.deposit(100);
        // Print the balance of account 'a' after deposit
        System.out.println("Balance of account 'a' after deposit: " + a.getBalance());
        
        // Withdraw $50 from account 'a'
        a.withdraw(50);
        // Withdraw $3.75 from account 'a'
        a.withdraw(3.75);
        // Print the balance of account 'a' after withdrawals
        System.out.println("Balance of account 'a' after withdrawals: " + a.getBalance());
        
        // Print the balance of account 'b' to show it remains unchanged
        System.out.println("Balance of account 'b' remains unchanged: " + b.getBalance());
    }
}
