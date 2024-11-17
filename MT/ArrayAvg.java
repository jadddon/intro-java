package MT;

public class ArrayAvg {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {1, 2, 3, 4, 5};
        // Initialize variables to calculate the average
        int avg = 0;
        int count = 0;
        // Iterate through the array to find elements less than 3
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is less than 3
            if (array[i] < 3) {
                // Add the element to the sum for average calculation
                avg += array[i];
                // Increment the count of elements less than 3
                count++;
            }
        }
        // Check if any elements less than 3 were found
        if (count > 0) {
            // Calculate the average by dividing the sum by the count
            avg /= count;
            // Print the calculated average
            System.out.println(avg);
        } else {
            // If no elements less than 3 were found, print a message
            System.out.println("No elements less than 3 found.");
        }
    }
}