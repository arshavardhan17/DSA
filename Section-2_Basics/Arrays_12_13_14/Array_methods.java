package Arrays_12_13_14;
import java.util.Arrays;

public class Array_methods {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Length of an array
        int length = arr.length;

        // Compare two arrays
        int[] arr2 = {5, 2, 8, 1, 3};
        boolean isEqual = Arrays.equals(arr, arr2);

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Binary search in a sorted array
        int index = Arrays.binarySearch(arr, 2);

        // Fill the array with a value
        Arrays.fill(arr, 0);
        System.out.println("Array after filling with 0: " + Arrays.toString(arr));

        // Copy an array
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Convert array to string
        String str = Arrays.toString(arr);

        // Output
        System.out.println("Length of the array: " + length);
        System.out.println("Are the arrays equal? " + isEqual);
        System.out.println("Copied array: " + Arrays.toString(copy));
        System.out.println("Index of 2 in the sorted array: " + index);
        System.out.println("Array as string: " + str);
    }
}
