package L15;

/**
 * Key Concepts to Learn:
 * 
 * 1. String Manipulation: This program demonstrates the use of the charAt method to extract a character from a string, and the substring method to extract a part of a string.
 * 2. Looping through Strings: The program showcases how to loop through each character in a string using a for loop and print each character.
 * 
 * This program initializes a string variable, extracts and prints a character from the string, loops through each character in the string and prints it, and finally prints a substring of the string.
 */

public class StringTester {
    public static void main(String[] args) {
        // Initialize a string variable x with the value "John"
        String x = "John";
        // Extract the character at index 1 from string x and store it in char a
        char a = x.charAt(1);
        // Print the character a
        System.out.println(a);
        // Loop through each character in string x and print it
        for(int i=0;i<x.length();i++) {
            System.out.println(x.charAt(i));
        }
        // Print the substring of x starting from index 1 and ending at index 3
        System.out.println(x.substring(1,3));
    }
}
