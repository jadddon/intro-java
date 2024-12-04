package L12;

/**
 * Key Concepts to Learn:
 * 
 * 1. Array Basics: This program demonstrates the creation, initialization, and manipulation of an array in Java.
 * 2. Array Indexing: It showcases how to access and modify elements within an array using their index.
 * 3. Array Traversal: The program highlights how to loop through an array and print each element's index and value.
 * 
 * This program initializes an array of integers, assigns values to each element, updates an element based on another element's value, and finally prints each element's index and value.
 */

public class ArrayTest {
    public static void main(String[] args) {
        // Declare and initialize an array of size 4
        int[] a = new int[4];
        // Assign values to each element of the array
        a[0] = 55;
        a[1] = 27;
        a[2] = 35;
        a[3] = 41;
        // Attempting to access an index out of bounds is not allowed
        //a[4] = 72; // This line would cause an ArrayIndexOutOfBoundsException
        // Print the value at index 1
        System.out.println(a[1]);
        // Update the value at index 1 based on the value at index 2
        a[1] = a[2] - 7;
        // Print the updated value at index 1
        System.out.println(a[1]);
        // Loop through the array and print each element's index and value
        for(int i=0;i<a.length;i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
