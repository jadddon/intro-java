package L10;

// Class to test the BankAccount3 class
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
