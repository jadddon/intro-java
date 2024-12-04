package L11;

/**
 * Key Concepts to Learn:
 * 
 * 1. Object-Oriented Programming (OOP): This program demonstrates the principles of OOP by creating a BankAccountTester4 class that interacts with the BankAccount4 class, showcasing the use of objects and their methods.
 * 2. Method Invocation: The program highlights the use of methods from the BankAccount4 class to manipulate and access the state of bank account objects.
 * 
 * This program includes a BankAccountTester4 class that tests the functionality of the BankAccount4 class by creating bank accounts, depositing money, and printing the balances.
 */
public class BankAccountTester4 {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of 50
        BankAccount4 a = new BankAccount4(50);
        
        // Deposit 2 into the bank account
        a.deposit(2);
        
        // Print the current balance of the bank account
        System.out.println(a);
    }
}
