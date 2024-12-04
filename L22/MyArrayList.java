package L22;

/**
 * Main Conceptual Points to Learn:
 * 
 * 1. A generic ArrayList is a dynamic array that can store elements of any data type.
 * 2. It has a fixed initial capacity, which can be increased dynamically as elements are added.
 * 3. The ArrayList class provides methods to add, remove, and access elements at specific locations.
 * 4. It is essential to check for IndexOutOfBoundsException when accessing or modifying elements to ensure the index is within the bounds of the array.
 * 5. The ArrayList class is a fundamental data structure in Java, offering flexibility and ease of use for managing collections of objects.
 */

public class MyArrayList<E> {
    // Instance variables
    private E[] array; // Array to store elements
    private int theSize; // Size of the array list
    private static final int INITIAL_CAPACITY = 10; // Initial capacity of the array

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        theSize = 0; // Initialize size to 0
        array = (E[]) new Object[INITIAL_CAPACITY]; // Create an array of initial capacity
    }

    public int size() {
        return theSize; // Return the size of the array list
    }

    public E get(int loc) {
        if(loc<0 || loc>=theSize) { // Check if location is out of bounds
            throw new IndexOutOfBoundsException(); // Throw exception if out of bounds
        }
        return array[loc]; // Return element at specified location
    }

    public E set(int loc, E value) {
        if(loc<0 || loc>=theSize) { // Check if location is out of bounds
            throw new IndexOutOfBoundsException(); // Throw exception if out of bounds
        }
        E oldValue = array[loc]; // Store the old value
        array[loc] = value; // Set the new value
        return oldValue; // Return the old value
    }
}