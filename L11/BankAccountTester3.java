package L11;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccountTester3 class that interacts with the BankAccount3 class, showcasing the use of objects and their methods.
 * 2. Method Invocation: The program highlights the use of methods from the BankAccount3 class to manipulate and access the state of bank account objects.
 * 
 * This program includes a BankAccountTester3 class that tests the functionality of the BankAccount3 class by creating bank accounts, depositing and withdrawing money, and printing the balances.
 */
public class BankAccountTester3 {
    public static void main(String[] args) {
        // Create two bank accounts, one with a balance of 0 and the other with a balance of 100
        BankAccount3 a = new BankAccount3();
        BankAccount3 b = new BankAccount3(100);
        
        // Print the balances of the two bank accounts
        System.out.println( a.getBalance() );
        System.out.println( b.getBalance() );
        
        // Withdraw 50 from the second bank account and print the new balance
        b.withdraw(50);
        System.out.println(b.getBalance());
        
        // Withdraw 30 from the second bank account with a fee of 5 and print the new balance
        b.withdraw(30,5);
        System.out.println(b.getBalance());
        
        // Print the first bank account
        System.out.println(a);
    }
}
