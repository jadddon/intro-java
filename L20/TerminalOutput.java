package L20;

/**
 * Key Concepts to Learn:
 * 
 * 1. Basic Output: This program demonstrates how to output values to the console using System.out.print() and System.out.println() methods.
 * 2. String Formatting: The program showcases the use of System.out.printf() for formatted string output, allowing for more control over the output format.
 * 3. Error Stream Output: The program also demonstrates how to output values to the error stream using System.err.println(), which is typically used for error messages.
 * 
 * This program initializes two integer variables, x and y, and outputs their values to the console using different methods, including basic output, formatted output, and error stream output.
 */

public class TerminalOutput {
    public static void main(String[] args) {
        // Initialize two integer variables
        int x = 55;
        int y = 7;
        // Print the value of x
        System.out.print(x);
        // Print a space
        System.out.print(" ");
        // Print the value of y
        System.out.println(y);
        // Print the value of x and y using printf
        System.out.printf("%d %d\n",x,y);
        // Print the value of x and y to the error stream
        System.err.println(x + " " + y);
    }
}
