// Write a Java program to sort an array of integers in ascending order. 

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] numbers = {34, 7, 23, 32, 5, 62};

        // Print original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        // Sort array in ascending order
        Arrays.sort(numbers);

        // Print sorted array
        System.out.println("Sorted Array (Ascending Order):");
        System.out.println(Arrays.toString(numbers));
    }
}
// output:
// Original Array:
// [34, 7, 23, 32, 5, 62]
// Sorted Array (Ascending Order):
// [5, 7, 23, 32, 34, 62]
