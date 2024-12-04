package L24;

// Key Points to Understand:
// 1. Recursion is a programming technique where a function calls itself as a subroutine.
// 2. A recursive function has a base case that stops the recursion.
// 3. The factorial of a number is the product of all positive integers less than or equal to that number.
// 4. The Fibonacci sequence is a series of numbers where a number is the sum of the two preceding ones, usually starting with 0 and 1.

public class Recursion {
    // Method to calculate the factorial of a number using recursion
    public static int factorial(int x) {
        // Base case
        if(x == 0) {
            return 1;
        }
        return x*factorial(x-1);
    }
    
    // Method to calculate the Fibonacci series using recursion
    public static int fib(int x) {
        // Base cases
        if(x==0 || x==1) {
            return 1;
        }
        return fib(x-1) + fib(x-2);
    }
    
    // Main method to test the fib method
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println( fib(n) );
    }
}
