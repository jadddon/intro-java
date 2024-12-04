package L20;

import java.io.PrintWriter; // Import PrintWriter for file output
import java.io.FileNotFoundException; // Import FileNotFoundException for handling file not found errors

/**
 * Key Concepts to Learn:
 * 
 * 1. File Output: This program demonstrates how to write to a file using a PrintWriter object.
 * 2. Exception Handling: This program throws a FileNotFoundException if the file specified by the command line argument does not exist.
 * 
 * This program writes two values (an integer and a double) to a file specified by the command line argument.
 */

public class OutputTester {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a PrintWriter object to write to a file specified by the first command line argument
        PrintWriter output = new PrintWriter(args[0]);
        // Declare and initialize an integer variable x
        int x = 10;
        // Declare and initialize a double variable y
        double y = 71.5;
        // Write the value of x to the file
        output.println(x);
        // Write the value of y to the file
        output.println(y);
        // Close the PrintWriter to ensure all data is written to the file
        output.close();
    }
}