package L8;

import java.util.Scanner;

// This class is used to test the for loop
public class ForTest3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for the limit
        System.out.print("How high? ");
        
        // Read the user's input and store it in the variable 'limit'
        int limit = in.nextInt();
        
        // Initialize a counter variable
        int i;
        
        // Loop to print numbers from 1 to the limit, excluding 13
        for(i=1; i<=limit; i++) {
            // Check if the current number is 13 and skip it
            if(i == 13) {
                continue;
            }
            // Print the current number
            System.out.println(i);
        }
        
        // Print the final value of 'i'
        System.out.println("i: " + i);
    }
}
