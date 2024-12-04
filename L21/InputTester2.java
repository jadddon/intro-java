package L21;

/**
 * Key Concepts to Learn:
 * 
 * 1. File Input/Output: This program demonstrates how to read from a file using a Scanner object.
 * 2. Exception Handling: This program throws a FileNotFoundException if the file specified by the command line argument does not exist.
 * 3. String Manipulation: This program splits each line of the file into individual words and prints them.
 * 
 * This program reads a file specified by the command line argument, splits each line into words, and prints each word with its line number.
 */

/// to run this use:       $ java InputTester2.java input1.txt


import java.io.FileNotFoundException; // Importing the FileNotFoundException class
import java.io.File; // Importing the File class
import java.util.Scanner; // Importing the Scanner class

public class InputTester2 {
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
            // Splitting the line into words
            String[] words = line.split(" ");
            // Printing the line number
            System.out.println("Line " + count);
            // Printing each word in the line
            for(String s : words) {
                System.out.println(s);
            }
            // Incrementing the line counter
            count++;
        }
        // Closing the scanner
        in.close();
    }
}
