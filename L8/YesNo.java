package L8;

import java.util.Scanner;

// This class is used to ask the user if they like ice cream
public class YesNo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user for their answer
        System.out.print("Do you like icecream? ");
        
        // Read the user's input and store it in the variable 'answer'
        String answer = s.nextLine();
        
        // Check the user's answer and respond accordingly
        if(answer.equals("yes")) {
            System.out.println("Go get a cone then.");
        } else if(answer.equals("no")) {
            System.out.println("There's tea in the hall");
        } else {
            System.out.println("What?");
        }
    }
}
