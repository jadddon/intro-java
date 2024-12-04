/**
 * Main Conceptual Points to Learn:
 * 
 * 1. ArrayList is a dynamic array that can grow or shrink in size as elements are added or removed.
 * 2. It is a generic class, allowing it to work with any type of data.
 * 3. The ArrayList class provides methods to add, remove, and access elements at specific positions.
 * 4. It automatically handles memory management for the array, including resizing when necessary.
 * 5. It is a fundamental data structure in Java, commonly used for storing and manipulating collections of data.
 */

package L22;
import java.util.ArrayList;

// Class declaration
public class Sample {
    // Main method
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<Integer> a = new ArrayList<>();
        // Add elements to the ArrayList
        a.add(5);
        a.add(6);
    }
}