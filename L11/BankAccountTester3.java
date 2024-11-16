package L11;

// This class is used to test the BankAccount3 class
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
