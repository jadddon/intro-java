package hw10;

import java.util.Arrays;

public class Problem2 {
    
    // Public method to perform binary search
    public static <E extends Comparable<E>> 
    int binarySearch(E[] a, E x) {
        return binarySearchHelper(a, x, 0, a.length - 1);
    }

    // Private helper method for recursive binary search
    private static <E extends Comparable<E>> 
    int binarySearchHelper(E[] a, E x, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }
        int mid = left + (right - left) / 2; // Calculate the middle index
        int compareResult = a[mid].compareTo(x); // Compare the middle element with the target value
        if (compareResult == 0) {
            return mid; // Element found
        } else if (compareResult > 0) {
            return binarySearchHelper(a, x, left, mid - 1); // Search in the left half
        } else {
            return binarySearchHelper(a, x, mid + 1, right); // Search in the right half
        }
    }

    public static void main(String[] args) {
        // Test with String array
        String[] stringArray = {"mudd", "butler", "sipa", "avery", "pupin", "low" };
        // Sort the stringArray in alphabetical order using the Arrays.sort method
        Arrays.sort(stringArray);
        String targetString = "mudd"; // Target element to find
        int indexString = binarySearch(stringArray, targetString); // Call the binary search
        System.out.println("Part 1 (strings): Index of " + targetString + " is " + indexString + ".");

        // Test with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        Arrays.sort(intArray); // Sort the array
        int target = 9; // Example target
        int index1 = -1, index2 = -1;

        // Find two indices that sum to target
        for (int i = 0; i < intArray.length; i++) {
            int complement = target - intArray[i]; // Calculate the complement
            index2 = binarySearch(intArray, complement); // Search for the complement
            if (index2 != -1 && index2 != i) { // Ensure indices are different
                index1 = i; // Store the current index
                break; // Exit the loop as we found a pair
            }
        }

        if (index1 != -1 && index2 != -1) {
            System.out.println("Part 2 (ints): Indices for values that add up to " + target + " are " + index1 + " and " + index2 + ".");
        } else {
            System.out.println("Part 2 (ints): No two indices for " + target + " are found that add up to " + target + ".");
        }
    }
}
