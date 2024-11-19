package L20; // Package declaration

/// to run this use:       $ java InputTester.java input1.txt

import java.io.File; // Importing the File class
import java.io.FileNotFoundException;
import java.util.Scanner; // Importing the Scanner class

public class InputTester3 { // Class declaration

    // The main method is the entry point of the program. It is declared as static, meaning it can be called without creating an instance of the class.
    // The method takes an array of String arguments, which represents the command line arguments passed to the program.

    public static void main(String[] args) {

        File f = new File(args[0]); // Creates a new File object from the first command line argument
        Scanner in;

        try{
            in = new Scanner(f); 
        } catch(FileNotFoundException e){
            System.err.println(args[0] + "does not exist");
            return; // return kewyord causes a method to end
                    // can also use: System.exit(-1);
        }
        
        int count = 1; // Initialize a counter to keep track of the line number
        while(in.hasNextLine()) { // Loop through each line in the file
            String line = in.nextLine(); // Read the next line
            System.out.printf("Line %d: %s\n", count, line); // Print the line number and the line itself
            count++; // Increment the counter for the next line
        }

        // This line is necessary to close the Scanner object after it's done reading from the file.
        // Closing the Scanner ensures that system resources are released and prevents potential memory leaks.
        in.close();



    }
}




