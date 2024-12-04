package L24;
/**
 * Main Conceptual Points to Learn:
 * 
 * 1. Binary search is a fast search algorithm that finds the position of a target value within a sorted array.
 * 2. It compares the target value to the middle element of the array and eliminates half of the array in each iteration.
 * 3. The time complexity of binary search is O(log n), making it much faster than linear search for large datasets.
 * 4. Binary search requires the array to be sorted in ascending or descending order.
 * 5. The algorithm repeatedly divides the search interval in half and searches for the value in the appropriate half until the size of the interval is zero.
 * 
 * This Java program demonstrates the implementation of binary search on a sorted array of integers.
 */

public class BinarySearch {
    /**
     * Performs a binary search on a sorted array to find the index of a given value.
     * 
     * @param a The sorted array to search in.
     * @param value The value to search for.
     * @return The index of the value if found, -1 otherwise.
     */
    public static int binarySearch(int[] a, int value) {
        int start = 0; // Initialize the start index to 0
        int stop = a.length - 1; // Initialize the stop index to the last index of the array
        while (start <= stop) { // Continue the loop as long as start is less than or equal to stop
            int mid = (start + stop) / 2; // Calculate the middle index
            if (a[mid] == value) { // If the value at the middle index is equal to the target value
                return mid; // Return the middle index
            } else if (a[mid] > value) { // If the value at the middle index is greater than the target value
                // If the value exists, it's in the lower half
                stop = mid - 1; // Adjust the stop index to the left half
            } else { // If the value at the middle index is less than the target value
                // If the value exists, it's in the upper half
                start = mid + 1; // Adjust the start index to the right half
            }
        }
        return -1; // Return -1 if the value is not found
    }

    /**
     * Main method to test the binarySearch method.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 21, 35, 66, 71}; // Test array
        System.out.println(binarySearch(arr, 23)); // Test case 1
        System.out.println(binarySearch(arr, 71)); // Test case 2
        System.out.println(binarySearch(arr, 10)); // Test case 3
    }
}