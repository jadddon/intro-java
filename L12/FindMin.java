package L12;

// Class to find the minimum element in an array
public class FindMin {
    // Method to find the index of the minimum element in an array
    public static int min(int[] arr) {
        int locmin = 0; // Initialize the index of the minimum element
        for(int i=1;i<arr.length;i++) { // Loop through the array starting from the second element
            if(arr[i]<arr[locmin]) { // Check if the current element is smaller than the current minimum
                locmin = i; // Update the index of the minimum element
            }
        }
        return locmin; // Return the index of the minimum element
    }
    // Main method to test the min method
    public static void main(String[] args) {
        int[] a = { 5, 4, 3, 1, 2, 21, 1, 4, 1 }; // Array to test
        int m = min(a); // Find the index of the minimum element
        System.out.println("a[" + m + "] = " + a[m]); // Print the minimum element and its index
    }
}
