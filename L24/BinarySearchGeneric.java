package L24;

// Key Points to Understand:
// 1. Binary search is a fast search algorithm that finds the position of a target value within a sorted array.
// 2. It compares the target value to the middle element of the array and eliminates half of the array in each iteration.
// 3. The algorithm repeats the comparison process until the target value is found or the search space is empty.
// 4. Binary search requires the array to be sorted in ascending order.
// 5. It is a divide-and-conquer algorithm with a time complexity of O(log n), making it efficient for large datasets.

public class BinarySearchGeneric {
    /**
     * Performs a binary search on a sorted array to find the index of a given value.
     * 
     * @param a The sorted array to search in.
     * @param value The value to search for.
     * @return The index of the value if found, -1 otherwise.
     */
    public static <E extends Comparable<E>>
    int binarySearch(E[] a, E value) {
        int start = 0; // Initialize the start index to 0
        int stop = a.length - 1; // Initialize the stop index to the last index of the array
        while (start <= stop) { // Continue the loop as long as start is less than or equal to stop
            int mid = (start + stop) / 2; // Calculate the middle index
            int compareResult = a[mid].compareTo(value); // Compare the middle element with the target value
            if (compareResult == 0) { // If the value at the middle index is equal to the target value
                return mid; // Return the middle index
            } else if (compareResult > 0) { // If the value at the middle index is greater than the target value
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
        String[] arr = { "aardvark", "hello", "world", "zoo", "zoom"}; // Test array
        System.out.println(binarySearch(arr, "hello")); // Test case 1
        System.out.println(binarySearch(arr, "goodbye")); // Test case 2
        System.out.println(binarySearch(arr, "zoom")); // Test case 3
    }
}