// Import the Scanner class for user input
import java.util.Scanner;

public class HelloYou { // Define a public class named HelloYou
    public static void main(String[] args) { // Main method where the program execution begins
        // Create a Scanner object to read input from the console
        Scanner s = new Scanner(System.in); 
        
        // Prompt the user for their name
        System.out.print("What is your name: "); 
        
        // Read the user's input and store it in the variable 'name'
        String name = s.nextLine(); 
        
        // Print a greeting message that includes the user's name
        System.out.println("Hello " + name + "!"); 
        
        // Close the Scanner object to prevent resource leaks
        s.close(); 
    }
}

