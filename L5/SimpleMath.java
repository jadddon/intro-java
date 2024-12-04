package L5;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * Key Concepts to Learn:
 * 
 * 1. Basic Arithmetic Operations: This program demonstrates the use of basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus.
 * 2. Integer Division: The program highlights the concept of integer division, where the fractional part is discarded, and the result is an integer.
 * 3. Order of Operations: The program showcases the importance of order of operations in mathematical expressions, including the use of parentheses to change the order.
 * 4. User Input: This program demonstrates how to use the Scanner class to read user input and perform operations based on that input.
 * 
 * This program explores basic arithmetic operations, integer division, order of operations, and user input in Java.
 */
public class SimpleMath {
    public static void main(String[] args) {
        int x, y; // Declare integer variables x and y
        x = 5; // Assign value 5 to x
        y = 8; // Assign value 8 to y
        
        // Performing and displaying basic arithmetic operations
        System.out.println(x + y); // Addition
        System.out.println(x - y); // Subtraction
        System.out.println(x * y); // Multiplication
        System.out.println(x / y); // Division
        System.out.println(x % y); // Modulus (remainder)

        // Examples of integer division
        System.out.println(4 / 2); // Integer division, result is 2
        System.out.println(5 / 2); // Integer division, result is 2 (fractional part is discarded)

        double a = 3.8; // Declare a double variable a and assign it 3.8
        System.out.println(a / x); // Division of a by x, result is a double

        int z; // Declare an integer variable z
        z = 5 + 7 * x; // Calculate z using order of operations (multiplication before addition)
        System.out.println(z); // Display the result of z

        z = (5 + 7) * x; // Calculate z with parentheses, changing the order of operations
        System.out.println(z); // Display the result of z

        Scanner s = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Give me an integer: "); // Prompt user for input
        int g = s.nextInt(); // Read an integer input from the user
        System.out.println(g / 2); // Display half of the input (integer division)
        System.out.println(g / 2.0); // Display half of the input (floating-point division)
    }
}


