package L15;

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
