package hw10;




import java.util.Arrays;

public class Problem3 {
    
    //public method -- binary search given from lecture 24
    public static <E extends Comparable<E>>
    int binarySearch(E[] a, E x) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int compareResult = a[middle].compareTo(x);
            if (compareResult == 0) {
                return middle; // finding the correct element here
            } else if (compareResult > 0) {
                right = middle - 1; // binary search the left side
            } else {
                left = middle + 1; // binary search the right side
            }
        }
        return -1;
    }

    // main method
    public static void main(String[] args) {

        // testing array of strings
        String[] stringArray = {"mudd", "butler", "sipa", "avery", "pupin","low"};
        //sorting 
        Arrays.sort(stringArray);

        //define the target string in the array
        String targetString = "mudd";

        // calling binarySearch
        int indexString = binarySearch(stringArray, targetString);
        // print result
        System.out.println("Part 1 (strings): Index of " + targetString + " is " + indexString + ".");

        // testing array of ints 
        Integer[] intArray = {0,1,2,3,4,5,6,7};
        //sorting
        Arrays.sort(intArray);

        int targetInt = 12;
        int index1 = -1;
        int index2 = -1;

        // finding sums of indices
        for(int i = 0; i < intArray.length; i++){
            //calculate complement
            int comp = targetInt - intArray[i]; 
            index2 = binarySearch(intArray, comp);
            if(index2 != -1 && index2 != i) {
                index1 = i;
                break;
            }
        }

        if (index1 != -1 && index2 != -1){
            System.out.println("Part 2 (ints): Indices for values that add up to " + targetInt + " are " + index1 + " and " + index2 + ".");
        } else {
            System.out.println("Part 2 (ints): No two indices are found that add up to " + targetInt + ".");
        }

    }
    
}