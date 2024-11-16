package L7;

import java.util.Scanner; // Importing the Scanner class for user input

public class IfTest5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to hold the user's answer
        double answer;
        
        // Prompt the user for the answer
        System.out.print("What is the answer? ");
        
        // Read the user's input and store it in the variable 'answer'
        answer = input.nextDouble();
        
        // Check if the answer is 42 and handle it
        if(answer == 42) {
            System.out.println("You've found the answer!");
        } 
        // Check if the answer is close to 42 (41 or 43) and handle it
        else if(answer >= 41 && answer <= 43) {
            System.out.println("You're close.");
        } 
        // If none of the above conditions are met, print a message to keep looking
        else {
            System.out.println("Keep looking...");
        }
        
        // Print a message indicating the end of the program
        System.out.println("This is the end.");
    }
}
