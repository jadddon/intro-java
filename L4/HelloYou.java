package L4;

/**
 * Key Concepts to Learn:
 * 
 * 1. User Input: This program demonstrates how to use the Scanner class to read user input.
 * 2. Conditional Statements: The program highlights the use of if-else statements to check conditions and make decisions based on user input.
 * 3. String Manipulation: The program showcases the use of string concatenation to personalize a greeting message.
 * 
 * This program prompts the user for their name, checks if the input is empty, and prints a personalized greeting message.
 */
// Import the Scanner class for user input
import java.util.Scanner;

public class HelloYou { // Define a public class named HelloYou
    public static void main(String[] args) { // Main method where the program execution begins
        // Use try-with-resources to ensure the Scanner is closed automatically
        try (Scanner s = new Scanner(System.in)) { 
            // Prompt the user for their name
            System.out.print("What is your name: "); 
            
            // Read the user's input and store it in the variable 'name'
            String name = s.nextLine(); 
            
            // Check if the name is empty and handle it
            if (name.isEmpty()) {
                System.out.println("You didn't enter a name!");
            } else {
                // Print a greeting message that includes the user's name
                System.out.println("Hello " + name + "!"); 
            }
        } // The Scanner is automatically closed here
    }
}
