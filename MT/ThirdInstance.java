package MT;

public class ThirdInstance {
    
    // Method to find the third instance of a given element in an array
    public static void findThirdInstance(int[] data, int x) {
        int count = 0; // Initialize a counter to keep track of instances of x
        for (int i = 0; i < data.length; i++) { // Iterate through the array
            if (data[i] == x) { // Check if the current element is equal to x
                count++; // Increment the counter if x is found
            }
            if (count == 3) { // If the third instance of x is found
                System.out.println("The third instance of x is found at " + i); // Print the index
                break; // Exit the loop
            }
        }
    }
}