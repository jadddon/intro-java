package L13;

public class Search {
    // Method to perform binary search in a sorted array
    public static int binarySearch(int[] arr, int v) {
        int start = 0; // Initialize start index
        int stop = arr.length - 1; // Initialize stop index
        while(start <= stop) { // Continue until start is less than or equal to stop
            int mid = (stop + start)/2; // Calculate the middle index
            if(arr[mid] == v) { // If the middle element matches the value
                return mid; // Return the middle index
            } else if(arr[mid] < v) { // If the middle element is less than the value
                start = mid + 1; // Move the start index to the right half
            } else { // If the middle element is greater than the value
                stop = mid - 1; // Move the stop index to the left half
            }
        }
        return -1; // Return -1 if the value is not found
    }
    // Method to perform linear search in an array
    public static int linearSearch(int[] arr, int v) {
        int loc = -1; // Initialize location to -1 indicating not found
        for(int i = 0;i<arr.length;i++) { // Loop through the array
            if(arr[i] == v) { // Check if the current element matches the value
                loc = i; // Update location if match found
                return loc; // Return the location immediately
            }
        }
        return loc; // Return -1 if value not found
    }
    // Main method to test the search methods
    public static void main(String[] args) {
        //int[] a = { 5, 7, 6, 1, 4, 3, 1, 10, 1 }; // Array to search in
        int[] a = { 1, 3, 5, 10, 21, 55}; // Array to search in
        int m = binarySearch(a,21); // Call binarySearch with the array and value to search
        if(m<0) { // Check if the value was not found
            System.out.println("Not found."); // Print if value not found
        } else { // If value found
            System.out.println("a[" + m +"] = " + a[m]); // Print the location and value
        }
    }
    }
