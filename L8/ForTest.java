package L8;

import java.util.Scanner; // Importing the Scanner class for user input

public class ForTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for the limit
        System.out.print("How high? ");
        
        // Read the user's input and store it in the variable 'limit'
        int limit = in.nextInt();
        
        // Loop to print numbers from 1 to the limit
        for(int i=1; i<=limit; i++) {
            // Print the current number
            System.out.println(i);
        }
    }
}
