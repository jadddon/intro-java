package L8;

import java.util.Scanner; // Importing the Scanner class for user input

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