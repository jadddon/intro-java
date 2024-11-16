package L7;

import java.util.Scanner; // Importing the Scanner class for user input

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