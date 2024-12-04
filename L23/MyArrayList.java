package L23;

/**
 * Main Conceptual Points to Learn:
 * 
 * 1. An ArrayList is a dynamic array that can grow or shrink in size as elements are added or removed.
 * 2. It is a generic class, allowing it to work with any type of data.
 * 3. The ArrayList class provides methods to add, remove, and access elements at specific positions.
 * 4. It automatically handles memory management for the array, including resizing when necessary.
 * 5. It is a fundamental data structure in Java, commonly used for storing and manipulating collections of data.
 */

public class MyArrayList<E> {
    // Instance variables
    private E[] array; // Array to store elements
    private int theSize; // Size of the array list
    private static final int INITIAL_CAPACITY = 10; // Initial capacity of the array

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        // Initialize the array list with initial capacity
        theSize = 0;
        array = (E[]) new Object[INITIAL_CAPACITY];
    }

    public int size() {
        // Return the size of the array list
        return theSize;
    }

    public E get(int loc) {
        // Check if the location is within bounds
        if(loc<0 || loc>=theSize) {
            throw new IndexOutOfBoundsException();
        }
        // Return the element at the specified location
        return array[loc];
    }

    public E set(int loc, E value) {
        // Check if the location is within bounds
        if(loc<0 || loc>=theSize) {
            throw new IndexOutOfBoundsException();
        }
        // Store the old value
        E oldValue = array[loc];
        // Set the new value
        array[loc] = value;
        // Return the old value
        return oldValue;
    }

    public boolean add(E value) {
        // Check if the array is full
        if(array.length==theSize) {
            // Grow the array if it's full
            grow(array.length*2);
        }
        // Add the value to the end of the array
        array[theSize++] = value;
        // Return true to indicate successful addition
        return true;
    }

    public void add(int loc, E value) {
        // Check if the location is within bounds
        if(loc<0 || loc>theSize) {
            throw new IndexOutOfBoundsException();
        }
        // Check if the array is full
        if(array.length==theSize) {
            // Grow the array if it's full
            grow(array.length*2);
        }
        // Shift elements to the right to make space for the new element
        for(int i=theSize;i>loc;i--) {
            array[i] = array[i-1];
        }
        // Add the value at the specified location
        array[loc] = value;
        // Increment the size
        theSize++;
    }

    public E remove(int loc) {
        // Check if the location is within bounds
        if(loc<0 || loc>=theSize) {
            throw new IndexOutOfBoundsException();
        }
        // Store the old value
        E oldValue = array[loc];
        // Shift elements to the left to fill the gap
        for(int i=loc;i<theSize-1;i++) {
            array[i] = array[i+1];
        }
        // Decrement the size
        theSize--;
        // Return the old value
        return oldValue;
    }

    @SuppressWarnings("unchecked")
    private void grow(int newCapacity) {
        // Check if the new capacity is greater than the current capacity
        if(newCapacity<=array.length) {
            return;
        }
        // Create a new array with the new capacity
        E[] temp = (E[]) new Object[newCapacity];
        // Copy elements from the old array to the new array
        for(int i=0;i<array.length;i++) {
            temp[i] = array[i];
        }
        // Update the array reference
        array = temp;
    }
}
