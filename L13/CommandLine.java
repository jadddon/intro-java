package L13;

/**
 * Key Concepts to Learn:
 * 
 * 1. Command Line Arguments: This program demonstrates how to access and process command line arguments in Java.
 * 2. Array Traversal: It showcases how to traverse an array of strings (command line arguments) and print each element.
 * 
 * This program prints the number of command line arguments and then iterates through each argument, printing it to the console.
 */
public class CommandLine {
    public static void main(String[] args) {
        // Print the number of command line arguments
        System.out.println(args.length);
        // Loop through each argument and print it
        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
    }
}