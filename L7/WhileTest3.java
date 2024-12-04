package L7;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * Key Concepts to Learn:
 * 
 * 1. User Input: This program demonstrates how to use the Scanner class to read user input.
 * 2. Looping: The program highlights the use of a while loop to iterate over a range of numbers and perform a specific action.
 * 3. Conditional Statements: The program demonstrates the use of if statements to check conditions and make decisions based on user input.
 * 
 * This program prompts the user to enter a limit and then prints numbers from 1 up to the entered limit, excluding the number 13.
 */
public class WhileTest3 {
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
        
        // Loop to print numbers from 1 to the limit, excluding 13
        while(i <= limit) {
            // Check if the current number is 13 and skip it
            if(i == 13) {
                i++; // Increment 'i' to skip 13
                continue; // Skip the rest of the loop for this iteration
            }
            // Print the current number
            System.out.println(i);
            // Increment the counter variable
            i++;
        }
        
        // Print the final value of 'i'
        System.out.println("i is: " + i);
    }
}