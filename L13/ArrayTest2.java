package L13;

public class ArrayTest2 {
    public static void main(String[] args) {
        // Initialize an array with values
        int[] a = { 51, 21, 22, 4};
        // Print the original array elements
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        System.out.println("------"); // Separator line for output
        // Modify the array elements
        arrayMod(a);
        // Print the modified array elements
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    // Method to modify the array elements to 0
    public static void arrayMod(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            arr[i] = 0; // Set each element to 0
        }
    }
}
