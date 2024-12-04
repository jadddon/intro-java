package L8;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * Key Concepts to Learn:
 * 
 * 1. User Input: This program demonstrates how to use the Scanner class to read user input.
 * 2. Looping: The program highlights the use of a while loop to continuously read numbers until a negative number is entered.
 * 3. Conditional Statements: The program demonstrates the use of if statements to check conditions and make decisions based on user input.
 * 4. Data Types and Operations: The program showcases the use of different data types (int and double) and operations (addition, division) to calculate the average of numbers.
 * 
 * This program calculates the average of a series of numbers entered by the user. It continues to prompt the user for numbers until a negative number is entered, indicating the end of the input.
 */
public class Average2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declare variables to hold the current number, sum, and count
        int x;
        int sum = 0;
        int count = 0;
        
        // Loop to continue reading numbers until a negative number is entered
        while(true) {
            // Prompt the user to enter a number (negative to stop)
            System.out.print("Enter # (negative to stop): ");
            // Read the user's input and store it in the variable 'x'
            x = input.nextInt();
            
            // Check if the entered number is negative and break the loop if true
            if(x < 0) {
                break;
            }
            
            // Add the current number to the sum
            sum += x;
            // Increment the count of numbers
            count++;
        }
        
        // Check if no numbers were entered
        if(count == 0) {
            System.out.println("No input.");
        } else {
            // Calculate the average
            double average = (double)sum / count;
            // Print the average
            System.out.println("Average: " + average);
        }
    }
}
