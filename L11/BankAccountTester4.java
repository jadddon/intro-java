package L11;

// This class is used to test the BankAccount4 class
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
