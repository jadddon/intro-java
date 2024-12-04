package L7;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * Key Concepts to Learn:
 * 
 * 1. User Input: This program demonstrates how to use the Scanner class to read user input.
 * 2. Looping: The program highlights the use of a while loop to iterate over a range of numbers and perform a specific action.
 * 3. Conditional Statements: The program demonstrates the use of if statements to check conditions and make decisions based on user input.
 * 
 * This program prompts the user to enter numbers and calculates their average.
 */
public class Average {
    public static void main(String[] args) {
        // Initialize variables to hold the sum and count of numbers
        int sum = 0;
        int count = 0;
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter numbers (negative to stop)
        System.out.print("Enter # (negative to stop): ");
        
        // Read the user's input and store it in the variable 'x'
        int x = input.nextInt();
        
        // Loop to continue reading numbers until a negative number is entered
        while(x >= 0) {
            // Add the current number to the sum
            sum += x;
            // Increment the count of numbers
            count++;
            
            // Prompt the user to enter the next number
            System.out.print("Enter # (negative to stop): ");
            // Read the next number
            x = input.nextInt();
        }
        
        // Check if no numbers were entered
        if(count == 0) {
            System.out.println("No input");
        } else {
            // Calculate the average
            double average = (double)sum / count;
            // Print the average
            System.out.println("Average: " + average);
        }
    }
}