package L6;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * Key Concepts to Learn:
 * 
 * 1. User Input: This program demonstrates how to use the Scanner class to read user input.
 * 2. Conditional Statements: The program highlights the use of if-else statements to check conditions and make decisions based on user input.
 * 
 * This program prompts the user to enter a number and checks if it is the answer (42). If the answer is correct, it prints a congratulatory message. If the answer is close to 42 (41 or 43), it prints a message indicating the user is close. Otherwise, it prints a message indicating the end of the program.
 */
public class IfTest4 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the answer
        System.out.print("What is the answer? ");
        
        // Read the user's input and store it in the variable 'answer'
        int answer = input.nextInt();
        
        // Check if the answer is 42 and handle it
        if(answer == 42) {
            System.out.println("You've found the answer!");
        } 
        // Check if the answer is close to 42 (41 or 43) and handle it
        else if(answer == 41 || answer == 43) {
            System.out.println("You're close");
        } 
        // If none of the above conditions are met, print a message to keep looking
        else {
            System.out.println("Keep looking.");
        }
        
        // Print a message indicating the end of the program
        System.out.println("This is the end.");
    }
}
