package L7;

import java.util.Scanner; // Importing the Scanner class for user input

public class WhileTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to hold the limit
        int limit;
        
        // Initialize a counter variable
        int i = 1;
        
        // Prompt the user for the limit
        System.out.print("How high? ");
        
        // Read the user's input and store it in the variable 'limit'
        limit = input.nextInt();
        
        // Loop to print numbers from 1 to the limit
        while(i <= limit) {
            // Print the current number
            System.out.println(i);
            
            // Increment the counter variable
            i += 1; // This is equivalent to i = i + 1; or i++; or ++i;
        }
    }
}
