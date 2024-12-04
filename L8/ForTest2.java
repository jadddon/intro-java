package L8;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * Key Concepts to Learn:
 * 
 * 1. User Input: This program demonstrates how to use the Scanner class to read user input.
 * 2. Looping: The program highlights the use of a for loop to iterate over a range of numbers and perform a specific action.
 * 3. Conditional Statements: The program demonstrates the use of if statements to check conditions and make decisions based on user input.
 * 
 * This program prompts the user to enter a limit and then prints numbers from 1 up to the entered limit, excluding 13.
 */
public class ForTest2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for the limit
        System.out.print("How high? ");
        
        // Read the user's input and store it in the variable 'limit'
        int limit = in.nextInt();
        
        // Loop to print numbers from 1 to the limit, excluding 13
        for(int i=1; i<=limit; i++) {
            // Check if the current number is 13 and skip it
            if(i == 13) {
                continue; // Skip the rest of the loop for this iteration
            }
            // Print the current number
            System.out.println(i);
        }
        
        // This won't compile because i is only scoped for within the for loop
        //System.out.println("i: " + i);
    }
}