package L10;

public class BankAccountTester3 {
    public static void main(String[] args) {
    BankAccount3 a = new BankAccount3();
    BankAccount3 b = new BankAccount3(100);
    System.out.println( a.getBalance() );
    System.out.println( b.getBalance() );
    b.withdraw(50);
    System.out.println(b.getBalance());
    b.withdraw(30,5);
    System.out.println(b.getBalance());
    System.out.println(a);
    }
    }
