package L21; // Package declaration

/**
 * Key Concepts to Learn:
 * 
 * 1. File Input/Output: This program demonstrates how to read from a file using a Scanner object.
 * 2. Exception Handling: This program throws a FileNotFoundException if the file specified by the command line argument does not exist.
 * 
 * This program reads a file specified by the command line argument and prints each line of the file with its line number.
 */

/// to run this use:       $ java InputTester3.java input1.txt

import java.io.FileNotFoundException; // Importing the FileNotFoundException class
import java.io.File; // Importing the File class
import java.util.Scanner; // Importing the Scanner class

public class InputTester3 {
    public static void main(String[] args) {
        // Creating a new file object from the command line argument
        File f = new File(args[0]);
        Scanner in = null;
        try {
            // Attempting to create a new scanner object to read from the file
            in = new Scanner(f);
        } catch(FileNotFoundException e) {
            // If the file is not found, print an error message and exit the program
            System.err.println(args[0] + " does not exist");
            System.exit(-1); // Exiting the program with an error code
        }
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




