package L20; // Package declaration

import java.io.FileNotFoundException; // Importing the FileNotFoundException class
import java.io.File; // Importing the File class
import java.util.Scanner; // Importing the Scanner class

public class InputTester { // Class declaration

    // The main method is the entry point of the program. It is declared as static, meaning it can be called without creating an instance of the class.
    // The method takes an array of String arguments, which represents the command line arguments passed to the program.
    // The method throws a FileNotFoundException, indicating that it may throw an exception if the file specified in the command line argument does not exist.
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File(args[0]); // Creates a new File object from the first command line argument
        Scanner in = new Scanner(f);

        int count = 1; // Initialize a counter to keep track of the line number
        while(in.hasNextLine()) { // Loop through each line in the file
            String line = in.nextLine(); // Read the next line
            System.out.printf("Line %d: %s", count, line); // Print the line number and the line itself
            count++; // Increment the counter for the next line
        }

        // This line is necessary to close the Scanner object after it's done reading from the file.
        // Closing the Scanner ensures that system resources are released and prevents potential memory leaks.
        in.close();



    }

    }



}
