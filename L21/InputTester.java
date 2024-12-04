package L21; // Package declaration

/**
 * Key Concepts to Learn:
 * 
 * 1. File Input/Output: This program demonstrates how to read from a file using a Scanner object.
 * 2. Exception Handling: This program throws a FileNotFoundException if the file specified by the command line argument does not exist.
 * 
 * This program reads a file specified by the command line argument and prints each line of the file with its line number.
 */

// Importing necessary libraries
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

// Class declaration
public class InputTester {
    // Main method
    public static void main(String[] args) throws FileNotFoundException {
        // Creating a new file object from the command line argument
        File f = new File(args[0]);
        // Creating a new scanner object to read from the file
        Scanner in = new Scanner(f);
        // Initializing a counter for the lines
        int count = 1;
        // Looping through each line in the file
        while(in.hasNextLine()) {
            // Reading the next line
            String line = in.nextLine();
            // Printing the line number and the line itself
            System.out.printf("Line %d: %s\n",count,line);
            // Incrementing the line counter
            count++;
        }
        // Closing the scanner
        in.close();
    }
}
