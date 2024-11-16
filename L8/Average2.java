package L8;

import java.util.Scanner; // Importing the Scanner class for user input

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
