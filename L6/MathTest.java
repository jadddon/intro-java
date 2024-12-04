package L6;

/**
 * Key Concepts to Learn:
 * 
 * 1. Data Types: This program demonstrates the use of different data types such as float, double, and int for numerical operations.
 * 2. Division Operations: The program highlights the differences in division operations between different data types, including integer division and explicit casting.
 * 3. Math Functions: The program showcases the use of Math functions for floor, ceil, and round operations, as well as calculating sine values.
 * 
 * This program explores various mathematical operations and concepts in Java, including data types, division operations, and Math functions.
 */
public class MathTest {
    public static void main(String[] args) {
        // Declare and initialize variables
        float a;
        double b;
        b = 3.5; // Assigning a double value to b

        // Assigning a float literal to a
        a = 3.5F; // Using 'F' to specify a float literal

        // Demonstrating division operations
        double x = 3.0;
        double y = x / 2; // Division of double by double
        System.out.println("The value of y is " + y);

        // Integer division, which discards the fractional part
        y = 3 / 2;
        System.out.println("The value of y is " + y);

        // Division of double by integer
        y = 3.0 / 2;
        System.out.println("The value of y is " + y);

        // Explicitly casting an integer to double for division
        y = (double) 3 / 2;
        System.out.println("The value of y is " + y);

        // Casting the result of integer division to double
        y = (double) (3 / 2);
        System.out.println("The value of y is " + y);

        // Casting a double to int, which discards the fractional part
        int c = (int) 3.5;
        System.out.println("The value of c is " + c);

        // Using Math functions for floor, ceil, and round operations
        b = 3.4;
        double result1 = Math.floor(b); // Returns the largest integer less than or equal to b
        System.out.println(result1);

        double result2 = Math.ceil(b); // Returns the smallest integer greater than or equal to b
        System.out.println(result2);

        double result3 = Math.round(b); // Returns the closest long to the argument
        System.out.println(result3);

        // Calculating sine values
        System.out.println(Math.sin(Math.PI / 2)); // Sine of 90 degrees
        System.out.println(Math.sin(Math.PI)); // Sine of 180 degrees
    }
}