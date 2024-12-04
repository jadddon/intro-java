package L23;

/**
 * Main Conceptual Points to Learn:
 * 
 * 1. Recursion is a programming technique where a function calls itself as a subroutine.
 * 2. A recursive function has a base case that stops the recursion.
 * 3. The factorial of a number is the product of all positive integers less than or equal to that number.
 * 
 * This Java program demonstrates the implementation of recursion to calculate the factorial of a number.
 */

public class Recursion {
    // Method to calculate the factorial of a number using recursion
    public static int factorial(int x) {
        // Base case: factorial of 0 is 1
        if(x == 0) {
            return 1;
        }
        // Recursive case: x times the factorial of x-1
        return x * factorial(x-1);
    }

    // Main method to test the factorial method
    public static void main(String[] args) {
        // Parse the first command line argument to an integer
        int n = Integer.parseInt(args[0]);
        // Print the factorial of n
        System.out.println(factorial(n));
    }
}
