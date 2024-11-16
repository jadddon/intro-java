package L9;

import java.util.Scanner; // Importing the Scanner class for user input

public class SwitchTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner s = new Scanner(System.in);
        
        // Display options to the user
        System.out.println("Press 1 for a cat.");
        System.out.println("Press 2 for a cow.");
        System.out.println("Press 3 for a rat.");
        System.out.println("Press 4 for a sheep.");
        System.out.println("Press 5 for a bird.");
        System.out.println("Press 6 for a dinosaur.");
        System.out.println("Press 0 for an operator.");
        
        // Prompt the user to enter their choice
        System.out.print("Choice? ");
        
        // Read the user's input and store it in the variable 'choice'
        int choice = s.nextInt();
        
        // Use a switch statement to handle the user's choice
        switch(choice) {
            case 1:
                System.out.println("Meow"); // Sound a cat makes
                break;
            case 2:
                System.out.println("Moo"); // Sound a cow makes
                break;
            case 3:
                System.out.println("Squeak"); // Sound a rat makes
                break;
            case 4:
                System.out.println("Baa"); // Sound a sheep makes
                break;
            case 5:
            case 6:
                System.out.println("Tweet"); // Sound a bird makes
                break;
            case 0:
                System.out.println("How can I help you."); // Message for an operator
                break;
            default:
                System.out.println("Bad option."); // Message for an invalid choice
                break;
        }
        
        // Thank the user for calling
        System.out.println("Thank you for calling.");
    }
}
