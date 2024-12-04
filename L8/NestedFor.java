package L8;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * Key Concepts to Learn:
 * 
 * 1. User Input: This program demonstrates how to use the Scanner class to read user input.
 * 2. Looping: The program highlights the use of nested for loops to iterate over a range of numbers and perform a specific action.
 * 
 * This program prompts the user to enter the size of a multiplication table and then prints the table up to the entered size.
 */
public class NestedFor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter the size of the multiplication table
        System.out.print("Size: ");
        
        // Read the user's input and store it in the variable 'size'
        int size = s.nextInt();
        
        // Outer loop to iterate over the rows of the multiplication table
        for(int i=1; i<=size; i++) {
            // Inner loop to iterate over the columns of the multiplication table
            for(int j=1; j<=size; j++) {
                // Print the product of 'i' and 'j' with a width of 4 characters
                System.out.printf("%4d ", i*j);
            }
            // Move to the next line after each row
            System.out.printf("\n");
        }
    }
}
